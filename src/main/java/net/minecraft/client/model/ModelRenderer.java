/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.minecraft.client.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.logic.location.LocationComponent;
import org.terasology.math.Quat4fUtil;
import org.terasology.rendering.assets.skeletalmesh.Bone;

import javax.vecmath.Quat4f;
import javax.vecmath.Vector3f;

/**
 * @author synopia
 */
public class ModelRenderer {
    private final Logger logger = LoggerFactory.getLogger(ModelRenderer.class);
    public String name;
    public boolean mirror;
    public float rotateAngleX;
    public float rotateAngleY;
    public float rotateAngleZ;

    public float rotationPointX;
    public float rotationPointY;
    public float rotationPointZ;

    public float textureWidth;
    public float textureHeight;

    public int textureOffsetX;
    public int textureOffsetY;

    private ModelBase model;
    private Bone bone;
    private EntityRef boneEntity;

    public ModelRenderer(ModelBase model, int u, int v) {
        this.model = model;
        bone = model.createBone(this, new Vector3f(), new Quat4f());
        textureOffsetX = u;
        textureOffsetY = v;
    }

    public void addBox(float x, float y, float z, int sizeX, int sizeY, int sizeZ) {
        addBox(x, y, z, sizeX, sizeY, sizeZ, 0);
    }

    public void addBox(float x, float y, float z, int sizeX, int sizeY, int sizeZ, float scale) {
        Vector3f offset = new Vector3f(x, y, z);
        Vector3f size = new Vector3f(sizeX, sizeY, sizeZ);
        model.addBox(bone, offset, size, textureOffsetX, textureOffsetY);
    }

    public void setRotationPoint(float x, float y, float z) {
        rotationPointX = x;
        rotationPointY = y;
        rotationPointZ = z;
    }

    public void setTextureSize(int x, int y) {
        textureWidth = x;
        textureHeight = y;
    }

    public void updateModel() {
        bone.setObjectPos(new Vector3f(rotationPointX, rotationPointY, rotationPointZ));
        bone.setObjectRotation(Quat4fUtil.fromAngles(rotateAngleX, rotateAngleY, rotateAngleZ));
    }

    public void updateEntity(Quat4f invWorldRot, float delta) {
        LocationComponent location = boneEntity.getComponent(LocationComponent.class);
        Quat4f rot = Quat4fUtil.fromAngles(rotateAngleX, rotateAngleY, rotateAngleZ);
        location.setLocalRotation(rot);
        location.setLocalPosition(new Vector3f(rotationPointX, rotationPointY, rotationPointZ));
        boneEntity.saveComponent(location);
    }

    public void render(float f5) {

    }

    public void setBoneEntity(EntityRef entity) {
        this.boneEntity = entity;
    }

    public EntityRef getBoneEntity() {
        return boneEntity;
    }
}
