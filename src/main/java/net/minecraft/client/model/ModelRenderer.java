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
import org.terasology.logic.location.LocationComponent;
import org.terasology.math.Quat4fUtil;
import org.terasology.rendering.tcn.TCN;

import javax.vecmath.Quat4f;
import javax.vecmath.Vector2f;
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

    public Vector3f offset;
    public Vector3f size;

    public ModelRenderer(ModelBase model, int u, int v) {
        model.addRenderer(this);
        textureOffsetX = u;
        textureOffsetY = v;
    }

    public void addBox(float x, float y, float z, int sizeX, int sizeY, int sizeZ) {
        offset = new Vector3f(x, y, z);
        size = new Vector3f(sizeX, sizeY, sizeZ);
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

    public void render(float f5) {
    }

    public TCN.Box build() {
        return new TCN.Box(name, offset, new Vector3f(rotationPointX, rotationPointY, rotationPointZ), new Vector3f(rotateAngleX, rotateAngleY, rotateAngleZ), size, new Vector2f(textureOffsetX, textureOffsetY));
    }

    public void update(LocationComponent location, float delta) {
        Quat4f rot = Quat4fUtil.fromAngles(rotateAngleX, rotateAngleY, rotateAngleZ);
        Quat4f rot2 = new Quat4f(-rot.w, rot.z, -rot.y, rot.x);
        Quat4f old = location.getLocalRotation();
        rot.sub(rot2, old);
        float d = rot.x * rot.x + rot.y * rot.y + rot.z * rot.z + rot.w * rot.w;
        if (d > 0.5f) {
            logger.info(d + " before " + old + " after " + rot2);
        }
        location.setLocalRotation(rot2);
    }
}
