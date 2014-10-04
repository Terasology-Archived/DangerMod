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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.terasology.entitySystem.entity.EntityManager;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.event.ReceiveEvent;
import org.terasology.entitySystem.prefab.Prefab;
import org.terasology.entitySystem.systems.BaseComponentSystem;
import org.terasology.entitySystem.systems.RegisterSystem;
import org.terasology.logic.common.ActivateEvent;
import org.terasology.logic.inventory.InventoryComponent;
import org.terasology.logic.inventory.InventoryManager;
import org.terasology.logic.players.event.OnPlayerSpawnedEvent;
import org.terasology.registry.In;
import org.terasology.world.WorldProvider;
import org.terasology.world.block.BlockManager;

import java.util.List;

/**
 * @author synopia
 */
@RegisterSystem
public class Sample extends BaseComponentSystem {
    private final Logger logger = LoggerFactory.getLogger(Sample.class);
    @In
    private WorldProvider worldProvider;
    @In
    private BlockManager blockManager;
    @In
    private EntityManager entityManager;
    @In
    private InventoryManager inventoryManager;

    @Override
    public void initialise() {
        logger.info("Sample started");
    }

    @ReceiveEvent
    public void onPlayerSpawn(OnPlayerSpawnedEvent event, EntityRef player, InventoryComponent inventory) {
        inventoryManager.giveItem(player, EntityRef.NULL, entityManager.create("spawnertool"));
    }

    @ReceiveEvent(components = SpawnToolComponent.class)
    public void onUseSpawnerTool(ActivateEvent event, EntityRef entityRef) {
        SpawnToolComponent toolComponent = entityRef.getComponent(SpawnToolComponent.class);

        List<Prefab> spawn = toolComponent.spawn(entityRef);
        for (Prefab prefab : spawn) {
            entityManager.create(prefab, event.getHitPosition());
        }
    }
}
