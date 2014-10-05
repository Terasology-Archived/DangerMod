/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.minecraft.client.model;


import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.terasology.asset.AssetManager;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.logic.characters.CharacterMoveInputEvent;
import org.terasology.logic.location.LocationComponent;
import org.terasology.registry.In;
import org.terasology.rendering.assets.mesh.MeshBuilder;
import org.terasology.rendering.assets.skeletalmesh.Bone;
import org.terasology.rendering.assets.skeletalmesh.SkeletalMeshData;
import org.terasology.rendering.assets.skeletalmesh.SkeletalMeshDataBuilder;
import org.terasology.rendering.logic.SkeletalMeshComponent;
import org.terasology.rendering.nui.properties.OneOf;
import org.terasology.rendering.nui.properties.Range;

import javax.vecmath.Quat4f;
import javax.vecmath.Vector2f;
import javax.vecmath.Vector3f;
import java.util.List;

public class ModelBase { //implements SkeletalMeshController {
    private final Logger logger = LoggerFactory.getLogger(ModelBase.class);
    public int textureWidth;
    public int textureHeight;

    private List<Bone> bones = Lists.newArrayList();
    private List<ModelRenderer> renderers = Lists.newArrayList();

    @In
    private AssetManager assetManager;
    private SkeletalMeshDataBuilder builder;
    private Bone root;

    private EntityRef entity;

    @Range(min = 0, max = 40, precision = 1)
    private float rdata;
    @Range(min = 0, max = 40, precision = 1)
    private float rtime;
    @Range(min = 0, max = 1, precision = 3)
    private float rwalkspeed;

    @Range(min = 0, max = 360, precision = 1)
    private float ryaw;
    @Range(min = 0, max = 360, precision = 1)
    private float rpitch;
    @Range(min = 0, max = 360, precision = 1)
    private float myaw;
    @Range(min = 0, max = 360, precision = 1)
    private float mpitch;
    @Range
    private float scale;

    public enum Target {
        OFF, DATA, TIME, WALKSPEED, YAW, PITCH, SCALE
    }

    public enum Form {
        SAW, WAVE
    }

    @OneOf.Enum
    private Target lfo1Target = Target.OFF;
    @OneOf.Enum
    private Form lfo1Form;
    @Range(min = -3, max = 3, precision = 3)
    private float lfo1Speed;
    @Range(min = 0, max = 40, precision = 1)
    private float lfo1Max;
    private float lfo1Time;

    @OneOf.Enum
    private Target lfo2Target = Target.OFF;
    @OneOf.Enum
    private Form lfo2Form;
    @Range(min = -3, max = 3, precision = 3)
    private float lfo2Speed;
    @Range(min = 0, max = 40, precision = 1)
    private float lfo2Max;
    private float lfo2Time;

    public ModelBase() {
        builder = new SkeletalMeshDataBuilder();
        builder.setTextureMapper(new MeshBuilder.TextureMapper() {
            float textureCoord[];

            @Override
            public void initialize(Vector3f offset, Vector3f size) {
                float width = size.x;
                float height = size.y;
                float depth = size.z;
                textureCoord = new float[]{
                        // Back
                        2 * depth + width, depth,
                        2 * depth + 2 * width, depth,
                        2 * depth + 2 * width, depth + height,
                        2 * depth + width, depth + height,
                        // front
                        depth + width, depth,
                        depth + width, depth + height,
                        depth, depth + height,
                        depth, depth,
                        // Bottom
                        depth + 2 * width, 0,
                        depth + 2 * width, depth,
                        depth + width, depth,
                        depth + width, 0,
                        // Top
                        depth, depth,
                        depth + width, depth,
                        depth + width, 0,
                        depth, 0,
                        // Right
                        depth + width, depth,
                        depth + width, depth + height,
                        2 * depth + width, depth + height,
                        2 * depth + width, depth,
                        // Left
                        depth, depth,
                        0, depth,
                        0, depth + height,
                        depth, depth + height,
                };

            }

            @Override
            public Vector2f map(int vertexIndex, float u, float v) {
                return new Vector2f((textureCoord[vertexIndex * 2] + u) / textureWidth, (textureCoord[vertexIndex * 2 + 1] + v) / textureHeight);
            }
        });
        root = new Bone(0, "root", new Vector3f(), new Quat4f(0, 0, 0, 1));
        builder.addBone(root);
        bones.add(root);
    }

    public void setEntity(EntityRef entity) {
        this.entity = entity;
        SkeletalMeshComponent skeletalMesh = entity.getComponent(SkeletalMeshComponent.class);
        for (ModelRenderer renderer : renderers) {
            EntityRef bone = skeletalMesh.boneEntities.get(renderer.name);
            renderer.setBoneEntity(bone);
        }
    }

    public void render(Entity entity, float walkspeed, float time, float data, float yaw, float pitch, float scale) {

    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    }

    public Bone createBone(ModelRenderer renderer, Vector3f position, Quat4f rotation) {
        int id = bones.size();
        Bone bone = new Bone(id, "Box" + id, position, rotation);
        renderer.name = bone.getName();
        bones.add(bone);
        builder.addBone(bone);
        root.addChild(bone);
        renderers.add(renderer);
        return bone;
    }

    public void addBox(Bone bone, Vector3f offset, Vector3f size, float u, float v) {
        builder.addBox(bone, offset, size, u, v);
    }

    public SkeletalMeshData getMeshData() {
        return builder.build();
    }

    public void updateModel() {
        for (ModelRenderer renderer : renderers) {
            renderer.updateModel();
        }
    }

    private float getLfo(Form form, float speed, float max, float time) {
        switch (form) {
            case SAW:
                return (speed * time) % max;
            case WAVE:
                return (float) Math.cos(speed * time) * max / 2 + max / 2;
        }
        return 0;
    }

    private void applyLfo(Target target, Form form, float speed, float max, float time) {
        if (target != Target.OFF && form != null) {
            float value = getLfo(form, speed, max, time);
            switch (target) {
                case DATA:
                    rdata = value;
                    break;
                case TIME:
                    rtime = value;
                    break;
                case WALKSPEED:
                    rwalkspeed = value;
                    break;
                case YAW:
                    ryaw = value;
                    break;
                case PITCH:
                    rpitch = value;
                    break;
                case SCALE:
                    scale = value;
                    break;
            }
        }
    }

    public void update(float delta) {
        applyLfo(lfo1Target, lfo1Form, lfo1Speed, lfo1Max, lfo1Time);
        applyLfo(lfo2Target, lfo2Form, lfo2Speed, lfo2Max, lfo2Time);
        lfo1Time += delta;
        lfo2Time += delta;
        render(null, rdata, rwalkspeed, rtime, ryaw, rpitch, scale);
        Quat4f worldRot = new Quat4f(0, 0, 0, 1);
        LocationComponent location = entity.getComponent(LocationComponent.class);
        location.getWorldRotation(worldRot);
        worldRot.inverse(worldRot);
        for (ModelRenderer renderer : renderers) {
            renderer.updateEntity(worldRot, delta);
        }
        entity.send(new CharacterMoveInputEvent(0, mpitch, myaw, new Vector3f(), false, false));
    }
}