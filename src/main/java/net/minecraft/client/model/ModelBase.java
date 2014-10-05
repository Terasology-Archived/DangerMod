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
import org.terasology.asset.AssetType;
import org.terasology.asset.AssetUri;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.logic.location.LocationComponent;
import org.terasology.registry.In;
import org.terasology.rendering.assets.skeletalmesh.SkeletalMesh;
import org.terasology.rendering.assets.skeletalmesh.SkeletalMeshData;
import org.terasology.rendering.logic.SkeletalMeshComponent;
import org.terasology.rendering.logic.SkeletalMeshController;
import org.terasology.rendering.tcn.TCN;
import org.terasology.rendering.tcn.TCNSkeletalMeshLoader;

import java.util.List;

public class ModelBase implements SkeletalMeshController {
    public int textureWidth;
    public int textureHeight;

    private List<ModelRenderer> renderers = Lists.newArrayList();

    private TCN tcn;

    @In
    private AssetManager assetManager;
    private SkeletalMesh mesh;
    private float time;

    public ModelBase() {
        tcn = new TCN();
    }

    public void render(Entity entity, float time, float walkspeed, float data, float yaw, float pitch, float scale) {

    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
        // TODO Auto-generated method stub

    }

    public void addRenderer(ModelRenderer renderer) {
        renderer.name = "Box" + renderers.size();
        renderers.add(renderer);
    }

    private TCN build() {
        for (ModelRenderer renderer : renderers) {
            tcn.boxes.add(renderer.build());
        }
        return tcn;
    }

    @Override
    public void update(EntityRef entity, float delta) {
        time += delta;
        float walkspeed = 1;
        float data = time;
        float yaw = 0;
        float pitch = 0;
        float scale = 1;
        render(null, time, walkspeed, data, yaw, pitch, scale);

        SkeletalMeshComponent skeletalMeshComp = entity.getComponent(SkeletalMeshComponent.class);

        for (ModelRenderer renderer : renderers) {
            EntityRef boneEntity = skeletalMeshComp.boneEntities.get(renderer.name);
            if (boneEntity == null) {
                continue;
            }
            LocationComponent boneLoc = boneEntity.getComponent(LocationComponent.class);
            if (boneLoc != null) {
                renderer.update(boneLoc, delta);
                boneEntity.saveComponent(boneLoc);
            }
        }
    }

    @Override
    public SkeletalMesh createMesh() {
        TCNSkeletalMeshLoader loader = new TCNSkeletalMeshLoader();
        SkeletalMeshData data = loader.createMesh(build());
        mesh = (SkeletalMesh) assetManager.generateAsset(new AssetUri(AssetType.SKELETON_MESH, "DangerMod:" + this.getClass().getSimpleName()), data);
        return mesh;
    }
}