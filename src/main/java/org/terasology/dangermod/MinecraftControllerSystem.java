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
package org.terasology.dangermod;

import com.google.common.collect.Maps;
import net.minecraft.client.model.ModelBase;
import org.terasology.asset.AssetManager;
import org.terasology.asset.AssetType;
import org.terasology.asset.AssetUri;
import org.terasology.entitySystem.entity.EntityManager;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.entity.lifecycleEvents.OnActivatedComponent;
import org.terasology.entitySystem.event.ReceiveEvent;
import org.terasology.entitySystem.systems.BaseComponentSystem;
import org.terasology.entitySystem.systems.RegisterSystem;
import org.terasology.entitySystem.systems.UpdateSubscriberSystem;
import org.terasology.logic.debug.DebugPropertiesSystem;
import org.terasology.logic.location.LocationComponent;
import org.terasology.registry.CoreRegistry;
import org.terasology.registry.In;
import org.terasology.rendering.assets.skeletalmesh.SkeletalMesh;
import org.terasology.rendering.assets.skeletalmesh.SkeletalMeshData;
import org.terasology.rendering.logic.SkeletalMeshComponent;

import java.util.Map;


/**
 * @author synopia
 */
@RegisterSystem
public class MinecraftControllerSystem extends BaseComponentSystem implements UpdateSubscriberSystem {
    @In
    AssetManager assetManager;
    @In
    EntityManager entityManager;

    private Map<EntityRef, ModelBase> models = Maps.newHashMap();

    @Override
    public void preBegin() {
        CoreRegistry.get(DebugPropertiesSystem.class).addProperty("MCS", this);
    }

    @ReceiveEvent(components = {MinecraftControllerComponent.class, LocationComponent.class})
    public void newSkeleton(OnActivatedComponent event, EntityRef entity) {
        MinecraftControllerComponent component = entity.getComponent(MinecraftControllerComponent.class);
        ModelBase model = null;
        switch (component.modelClass) {
            case "ModelAlosaurus":
                model = new ModelAlosaurus();
                break;
            case "ModelFrog":
                model = new ModelFrog();
                break;
            case "ModelAnt":
                model = new ModelAnt();
                break;
        }

        model.updateModel();
        CoreRegistry.get(DebugPropertiesSystem.class).addProperty(entity.toString(), model);
        SkeletalMeshData data = model.getMeshData();
        SkeletalMeshComponent meshComponent = new SkeletalMeshComponent();

        meshComponent.mesh = (SkeletalMesh) assetManager.generateAsset(new AssetUri(AssetType.SKELETON_MESH, "DangerMod:" + model.getClass().getSimpleName()), data);
        meshComponent.material = component.material;
        meshComponent.scale = component.scale;
        meshComponent.translate = component.translate;
        meshComponent.heightOffset = component.heightOffset;
        entity.addComponent(meshComponent);
        models.put(entity, model);
    }

    @Override
    public void update(float delta) {
        for (EntityRef entity : entityManager.getEntitiesWith(SkeletalMeshComponent.class, LocationComponent.class, MinecraftControllerComponent.class)) {
            SkeletalMeshComponent skeletalMesh = entity.getComponent(SkeletalMeshComponent.class);
            MinecraftControllerComponent controller = entity.getComponent(MinecraftControllerComponent.class);
            ModelBase model = models.get(entity);
            if (model != null && skeletalMesh.boneEntities != null) {
                model.setEntity(entity);
                model.update(delta);
            }
        }
    }
}
