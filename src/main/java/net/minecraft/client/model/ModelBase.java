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
import org.terasology.asset.AssetManager;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.registry.In;
import org.terasology.rendering.assets.mesh.MeshBuilder;
import org.terasology.rendering.assets.skeletalmesh.Bone;
import org.terasology.rendering.assets.skeletalmesh.SkeletalMeshData;
import org.terasology.rendering.assets.skeletalmesh.SkeletalMeshDataBuilder;

import javax.vecmath.Quat4f;
import javax.vecmath.Vector2f;
import javax.vecmath.Vector3f;
import java.util.List;

public class ModelBase { //implements SkeletalMeshController {
    public int textureWidth;
    public int textureHeight;

    private List<Bone> bones = Lists.newArrayList();
    private List<ModelRenderer> renderers = Lists.newArrayList();

    @In
    private AssetManager assetManager;
    private SkeletalMeshDataBuilder builder;
    private Bone root;

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

    public void render(Entity entity, float time, float walkspeed, float data, float yaw, float pitch, float scale) {

    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    }

    public Bone createBone(ModelRenderer renderer, Vector3f position, Quat4f rotation) {
        int id = bones.size();
        Bone bone = new Bone(id, "Box" + id, position, rotation);
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

    //    @Override
    public void update(EntityRef entity, float delta) {
//        time += delta;
//        float walkspeed = 1;
//        float data = time;
//        float yaw = 0;
//        float pitch = 0;
//        float scale = 1;
//        render(null, time, walkspeed, data, yaw, pitch, scale);
//
//        SkeletalMeshComponent skeletalMeshComp = entity.getComponent(SkeletalMeshComponent.class);
//
//        for (ModelRenderer renderer : renderers) {
//            EntityRef boneEntity = skeletalMeshComp.boneEntities.get(renderer.name);
//            if (boneEntity == null) {
//                continue;
//            }
//            LocationComponent boneLoc = boneEntity.getComponent(LocationComponent.class);
//            if (boneLoc != null) {
//                renderer.update(boneLoc, delta);
//                boneEntity.saveComponent(boneLoc);
//            }
//        }
    }

}