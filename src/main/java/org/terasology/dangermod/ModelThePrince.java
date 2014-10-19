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

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * Created by synopia on 19.10.2014.
 */
public class ModelThePrince extends ModelBase
{
    private float wingspeed = 1.0F;

    ModelRenderer body;
    ModelRenderer neck1;
    ModelRenderer neck;
    ModelRenderer neckbase;
    ModelRenderer head;
    ModelRenderer Rleg1;
    ModelRenderer Lleg1;
    ModelRenderer snout;
    ModelRenderer tail1;
    ModelRenderer tail2;
    ModelRenderer tail3;
    ModelRenderer tail4;
    ModelRenderer Lwing;
    ModelRenderer Rwing;
    ModelRenderer Tail5;
    ModelRenderer Tail6;
    ModelRenderer Lneck1;
    ModelRenderer Lneck;
    ModelRenderer Lhead;
    ModelRenderer Lsnout;
    ModelRenderer Rneck1;
    ModelRenderer Rneck;
    ModelRenderer Rhead;
    ModelRenderer Rsnout;
    ModelRenderer headfin;
    ModelRenderer Lheadfin;
    ModelRenderer Rheadfin;
    ModelRenderer Backfin;
    ModelRenderer Rwing2;
    ModelRenderer Rwing3;
    ModelRenderer Lwing2;
    ModelRenderer Lwing3;
    ModelRenderer Ljaw;
    ModelRenderer jaw;
    ModelRenderer Rjaw;

    public ModelThePrince()
    {
        this.wingspeed = 1;

        textureWidth = 128;
        textureHeight = 128;

        body = new ModelRenderer(this, 59, 34);
        body.addBox(-7F, -3F, -5F, 13, 8, 10);
        body.setRotationPoint(0.5F, 15F, 1F);
        body.setTextureSize(128, 128);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        neck1 = new ModelRenderer(this, 20, 45);
        neck1.addBox(-1.5F, -2F, -1F, 3, 4, 4);
        neck1.setRotationPoint(0F, 16F, -5F);
        neck1.setTextureSize(128, 128);
        neck1.mirror = true;
        setRotation(neck1, 0.715585F, 0F, 0F);
        neck = new ModelRenderer(this, 20, 31);
        neck.addBox(-1.5F, -8F, -1F, 3, 8, 3);
        neck.setRotationPoint(0F, 15F, -6F);
        neck.setTextureSize(128, 128);
        neck.mirror = true;
        setRotation(neck, 0F, 0F, 0F);
        neckbase = new ModelRenderer(this, 0, 76);
        neckbase.addBox(-4.5F, -4F, 0F, 9, 6, 3);
        neckbase.setRotationPoint(0F, 17F, 5F);
        neckbase.setTextureSize(128, 128);
        neckbase.mirror = true;
        setRotation(neckbase, 0F, 0F, 0F);
        head = new ModelRenderer(this, 20, 20);
        head.addBox(-2F, -3F, -3.5F, 4, 4, 5);
        head.setRotationPoint(0F, 8F, -6F);
        head.setTextureSize(128, 128);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        Rleg1 = new ModelRenderer(this, 0, 58);
        Rleg1.addBox(-1.5F, 0F, -2F, 3, 8, 4);
        Rleg1.setRotationPoint(6F, 16F, 1F);
        Rleg1.setTextureSize(128, 128);
        Rleg1.mirror = true;
        setRotation(Rleg1, 0F, 0F, 0F);
        Lleg1 = new ModelRenderer(this, 15, 58);
        Lleg1.addBox(-1.5F, 0F, -2F, 3, 8, 4);
        Lleg1.setRotationPoint(-6F, 16F, 1F);
        Lleg1.setTextureSize(128, 128);
        Lleg1.mirror = true;
        setRotation(Lleg1, 0F, 0F, 0F);
        snout = new ModelRenderer(this, 20, 11);
        snout.addBox(-1.5F, -2F, -8.5F, 3, 3, 5);
        snout.setRotationPoint(0F, 8F, -6F);
        snout.setTextureSize(128, 128);
        snout.mirror = true;
        setRotation(snout, 0F, 0F, 0F);
        tail1 = new ModelRenderer(this, 59, 55);
        tail1.addBox(-6F, -3F, -3F, 12, 5, 3);
        tail1.setRotationPoint(0F, 16.5F, -2F);
        tail1.setTextureSize(128, 128);
        tail1.mirror = true;
        setRotation(tail1, 0F, 0F, 0F);
        tail2 = new ModelRenderer(this, 0, 86);
        tail2.addBox(-3F, -2.5F, 0F, 6, 4, 7);
        tail2.setRotationPoint(0F, 16F, 7F);
        tail2.setTextureSize(128, 128);
        tail2.mirror = true;
        setRotation(tail2, -0.3839724F, 0F, 0F);
        tail3 = new ModelRenderer(this, 0, 98);
        tail3.addBox(-2F, -2F, 0F, 4, 3, 6);
        tail3.setRotationPoint(0F, 18.2F, 13F);
        tail3.setTextureSize(128, 128);
        tail3.mirror = true;
        setRotation(tail3, -0.2094395F, 0F, 0F);
        tail4 = new ModelRenderer(this, 0, 108);
        tail4.addBox(-1.5F, -1.5F, 0F, 3, 2, 5);
        tail4.setRotationPoint(0F, 19.5F, 18F);
        tail4.setTextureSize(128, 128);
        tail4.mirror = true;
        setRotation(tail4, -0.0698132F, 0F, 0F);
        Lwing = new ModelRenderer(this, 59, 0);
        Lwing.addBox(-22F, 0F, -3F, 22, 0, 10);
        Lwing.setRotationPoint(-6F, 12.6F, 0F);
        Lwing.setTextureSize(128, 128);
        Lwing.mirror = true;
        setRotation(Lwing, 0F, 0F, 0.4014257F);
        Rwing = new ModelRenderer(this, 59, 66);
        Rwing.addBox(0F, 0F, -3F, 22, 0, 10);
        Rwing.setRotationPoint(6F, 12.6F, 0F);
        Rwing.setTextureSize(128, 128);
        Rwing.mirror = true;
        setRotation(Rwing, 0F, 0F, -0.4014257F);
        Tail5 = new ModelRenderer(this, 0, 116);
        Tail5.addBox(-3F, 0F, 0F, 6, 2, 4);
        Tail5.setRotationPoint(0F, 18F, 22F);
        Tail5.setTextureSize(128, 128);
        Tail5.mirror = true;
        setRotation(Tail5, 0F, 0F, 0F);
        Tail6 = new ModelRenderer(this, 0, 123);
        Tail6.addBox(-1F, 0F, 0F, 2, 2, 2);
        Tail6.setRotationPoint(0F, 18F, 26F);
        Tail6.setTextureSize(128, 128);
        Tail6.mirror = true;
        setRotation(Tail6, 0F, 0F, 0F);
        Lneck1 = new ModelRenderer(this, 0, 45);
        Lneck1.addBox(-1.5F, -2F, -1F, 3, 4, 4);
        Lneck1.setRotationPoint(4.5F, 16F, -5F);
        Lneck1.setTextureSize(128, 128);
        Lneck1.mirror = true;
        setRotation(Lneck1, 0.715585F, 0F, 0F);
        Lneck = new ModelRenderer(this, 0, 30);
        Lneck.addBox(-1.5F, -8F, -1F, 3, 8, 3);
        Lneck.setRotationPoint(4.5F, 15F, -6F);
        Lneck.setTextureSize(128, 128);
        Lneck.mirror = true;
        setRotation(Lneck, 0F, 0F, 0F);
        Lhead = new ModelRenderer(this, 0, 20);
        Lhead.addBox(-2F, -3F, -3.5F, 4, 4, 5);
        Lhead.setRotationPoint(4.5F, 8F, -6F);
        Lhead.setTextureSize(128, 128);
        Lhead.mirror = true;
        setRotation(Lhead, -0.0174533F, 0F, 0F);
        Lsnout = new ModelRenderer(this, 0, 11);
        Lsnout.addBox(-1.5F, -2F, -8.5F, 3, 3, 5);
        Lsnout.setRotationPoint(4.5F, 8F, -6F);
        Lsnout.setTextureSize(128, 128);
        Lsnout.mirror = true;
        setRotation(Lsnout, 0F, 0F, 0F);
        Rneck1 = new ModelRenderer(this, 40, 45);
        Rneck1.addBox(-1.5F, -2F, -1F, 3, 4, 4);
        Rneck1.setRotationPoint(-4.5F, 16F, -5F);
        Rneck1.setTextureSize(128, 128);
        Rneck1.mirror = true;
        setRotation(Rneck1, 0.715585F, 0F, 0F);
        Rneck = new ModelRenderer(this, 40, 31);
        Rneck.addBox(-1.5F, -8F, -1F, 3, 8, 3);
        Rneck.setRotationPoint(-4.5F, 15F, -6F);
        Rneck.setTextureSize(128, 128);
        Rneck.mirror = true;
        setRotation(Rneck, 0F, 0F, 0F);
        Rhead = new ModelRenderer(this, 40, 20);
        Rhead.addBox(-2F, -3F, -3.5F, 4, 4, 5);
        Rhead.setRotationPoint(-4.5F, 8F, -6F);
        Rhead.setTextureSize(128, 128);
        Rhead.mirror = true;
        setRotation(Rhead, 0F, 0F, 0F);
        Rsnout = new ModelRenderer(this, 40, 11);
        Rsnout.addBox(-1.5F, -2F, -8.5F, 3, 3, 5);
        Rsnout.setRotationPoint(-4.5F, 8F, -6F);
        Rsnout.setTextureSize(128, 128);
        Rsnout.mirror = true;
        setRotation(Rsnout, 0F, 0F, 0F);
        headfin = new ModelRenderer(this, 20, 0);
        headfin.addBox(-0.5F, -3F, 1F, 1, 4, 3);
        headfin.setRotationPoint(0F, 8F, -6F);
        headfin.setTextureSize(128, 128);
        headfin.mirror = true;
        setRotation(headfin, -0.122173F, 0F, 0F);
        Lheadfin = new ModelRenderer(this, 0, 0);
        Lheadfin.addBox(-0.5F, -3F, 1F, 1, 4, 3);
        Lheadfin.setRotationPoint(4.5F, 8F, -6F);
        Lheadfin.setTextureSize(128, 128);
        Lheadfin.mirror = true;
        setRotation(Lheadfin, -0.122173F, 0F, 0F);
        Rheadfin = new ModelRenderer(this, 40, 0);
        Rheadfin.addBox(-0.5F, -3F, 1F, 1, 4, 3);
        Rheadfin.setRotationPoint(-4.5F, 8F, -6F);
        Rheadfin.setTextureSize(128, 128);
        Rheadfin.mirror = true;
        setRotation(Rheadfin, -0.122173F, 0F, 0F);
        Backfin = new ModelRenderer(this, 35, 57);
        Backfin.addBox(-0.5F, 0F, 0F, 1, 3, 5);
        Backfin.setRotationPoint(0F, 12F, -1F);
        Backfin.setTextureSize(128, 128);
        Backfin.mirror = true;
        setRotation(Backfin, 0.5061455F, 0F, 0F);
        Rwing2 = new ModelRenderer(this, 59, 77);
        Rwing2.addBox(0F, 0F, -3F, 12, 0, 10);
        Rwing2.setRotationPoint(6F, 12.6F, 0F);
        Rwing2.setTextureSize(128, 128);
        Rwing2.mirror = true;
        setRotation(Rwing2, 0F, 0F, -0.6981317F);
        Rwing3 = new ModelRenderer(this, 59, 88);
        Rwing3.addBox(0F, 0F, -3F, 10, 0, 10);
        Rwing3.setRotationPoint(6F, 12.6F, 0F);
        Rwing3.setTextureSize(128, 128);
        Rwing3.mirror = true;
        setRotation(Rwing3, 0F, 0F, -0.0698132F);
        Lwing2 = new ModelRenderer(this, 59, 11);
        Lwing2.addBox(-12F, 0F, -3F, 12, 0, 10);
        Lwing2.setRotationPoint(-6F, 12.6F, 0F);
        Lwing2.setTextureSize(128, 128);
        Lwing2.mirror = true;
        setRotation(Lwing2, 0F, 0F, 0.6981317F);
        Lwing3 = new ModelRenderer(this, 59, 22);
        Lwing3.addBox(-10F, 0F, -3F, 10, 0, 10);
        Lwing3.setRotationPoint(-6F, 12.6F, 0F);
        Lwing3.setTextureSize(128, 128);
        Lwing3.mirror = true;
        setRotation(Lwing3, 0F, 0F, 0.0698132F);
        Ljaw = new ModelRenderer(this, 30, 70);
        Ljaw.addBox(-1.5F, 1F, -5F, 3, 1, 5);
        Ljaw.setRotationPoint(4.5F, 8F, -7F);
        Ljaw.setTextureSize(128, 128);
        Ljaw.mirror = true;
        setRotation(Ljaw, 0.2443461F, 0F, 0F);
        jaw = new ModelRenderer(this, 30, 80);
        jaw.addBox(-1.5F, 1F, -5F, 3, 1, 5);
        jaw.setRotationPoint(0F, 8F, -7F);
        jaw.setTextureSize(128, 128);
        jaw.mirror = true;
        setRotation(jaw, 0.2443461F, 0F, 0F);
        Rjaw = new ModelRenderer(this, 30, 90);
        Rjaw.addBox(-1.5F, 1F, -5F, 3, 1, 5);
        Rjaw.setRotationPoint(-4.5F, 8F, -7F);
        Rjaw.setTextureSize(128, 128);
        Rjaw.mirror = true;
        setRotation(Rjaw, 0.2443461F, 0F, 0F);

    }

    //f1 is scaled for movement speed! Yay!
    //f3 is head rotation to look at player, in degrees
    public void render(Entity c, float f, float f1, float f2, float f3, float f4, float f5) {
        float hf = 0.0F;
        float newangle = 0;
        float h1, h2, h3;
        float d1, d2, d3;
        float Ljx, Rjx, jx;
        int current_activity = c.getActivity();

        super.render(c, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, c);


        //Wing flapping
        if(f1 > 0.1 || c.getAttacking() != 0){
            newangle = MathHelper.cos(f2 * 2.3F * this.wingspeed) * (float)Math.PI * 0.40F * f1;
        }else{
            newangle = MathHelper.cos(f2 * 0.3F * this.wingspeed ) * (float)Math.PI * 0.04F;
        }

        this.Rwing.rotateAngleZ = newangle - 0.40f;
        this.Rwing2.rotateAngleZ = newangle - 0.60f;
        this.Rwing3.rotateAngleZ = newangle - 0.20f;
        this.Lwing.rotateAngleZ = -newangle + 0.40f;
        this.Lwing2.rotateAngleZ = -newangle + 0.60f;
        this.Lwing3.rotateAngleZ = -newangle + 0.20f;


        //Leg movement
        if(f1 > 0.1){
            newangle = MathHelper.cos(f2 * 2.0F * this.wingspeed ) * (float)Math.PI * 0.25F * f1;
        }else{
            newangle = 0.0F;
        }

        if(current_activity != 2 || c.getAttacking() != 0){
            this.Rleg1.rotateAngleX = newangle;
            this.Lleg1.rotateAngleX = -newangle;
        }else{
            //Flying... legs up!
            newangle = -1.0F;
            this.Rleg1.rotateAngleX = newangle;
            this.Lleg1.rotateAngleX = newangle;
        }


        //Tail just wags unless sitting
        newangle = MathHelper.cos(f2 * 0.9F * this.wingspeed) * (float)Math.PI * 0.06F;
        if(c.isSitting() == true){
            newangle = 0.0F; //Tail stops when sitting!
        }
        if(c.getAttacking() != 0){
            newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * (float)Math.PI * 0.12F;
        }
        this.tail2.rotateAngleY = newangle;

        this.tail3.rotationPointZ = this.tail2.rotationPointZ + (float)Math.cos(this.tail2.rotateAngleY)*6;
        this.tail3.rotationPointX = this.tail2.rotationPointX + ((float)Math.sin(this.tail2.rotateAngleY)*6.0F);
        this.tail3.rotateAngleY = newangle * 1.6F;

        this.tail4.rotationPointZ = this.tail3.rotationPointZ + (float)Math.cos(this.tail3.rotateAngleY)*5;
        this.tail4.rotationPointX = this.tail3.rotationPointX + ((float)Math.sin(this.tail3.rotateAngleY)*5.0F);
        this.tail4.rotateAngleY = newangle * 2.6F;

        this.Tail5.rotationPointZ = this.tail4.rotationPointZ + (float)Math.cos(this.tail4.rotateAngleY)*4;
        this.Tail5.rotationPointX = this.tail4.rotationPointX + ((float)Math.sin(this.tail4.rotateAngleY)*4.0F);
        this.Tail5.rotateAngleY = newangle * 3.6F;

        this.Tail6.rotationPointZ = this.Tail5.rotationPointZ + (float)Math.cos(this.Tail5.rotateAngleY)*4;
        this.Tail6.rotationPointX = this.Tail5.rotationPointX + ((float)Math.sin(this.Tail5.rotateAngleY)*4.0F);
        this.Tail6.rotateAngleY = newangle * 4.6F;


        //Rotate head left/right

        h1 = h2 = h3 = f3*2/3;
        d1 = d2 = d3 = f4*2/3;
        if(h1 < 0){
            h2 = h3 = h1/2;
            d2 = d3 = d1/2;
        }else{
            h2 = h1 = h3/2;
            d2 = d1 = d3/2;
        }
        this.head.rotateAngleY = (float)Math.toRadians((double)h2);
        this.snout.rotateAngleY = (float)Math.toRadians((double)h2);
        this.headfin.rotateAngleY = (float)Math.toRadians((double)h2);
        this.jaw.rotateAngleY = (float)Math.toRadians((double)h2);
        this.jaw.rotationPointZ = this.snout.rotationPointZ - (float)Math.cos(this.snout.rotateAngleY);
        this.jaw.rotationPointX = this.snout.rotationPointX - (float)Math.sin(this.snout.rotateAngleY);
        this.neck.rotateAngleY = (float)Math.toRadians((double)h2)/2.0f;

        this.Lhead.rotateAngleY = (float)Math.toRadians((double)h1);
        this.Lsnout.rotateAngleY = (float)Math.toRadians((double)h1);
        this.Lheadfin.rotateAngleY = (float)Math.toRadians((double)h1);
        this.Ljaw.rotateAngleY = (float)Math.toRadians((double)h1);
        this.Ljaw.rotationPointZ = this.Lsnout.rotationPointZ - (float)Math.cos(this.Lsnout.rotateAngleY);
        this.Ljaw.rotationPointX = this.Lsnout.rotationPointX - (float)Math.sin(this.Lsnout.rotateAngleY);
        this.Lneck.rotateAngleY = (float)Math.toRadians((double)h1)/2.0f;

        this.Rhead.rotateAngleY = (float)Math.toRadians((double)h3);
        this.Rsnout.rotateAngleY = (float)Math.toRadians((double)h3);
        this.Rheadfin.rotateAngleY = (float)Math.toRadians((double)h3);
        this.Rjaw.rotateAngleY = (float)Math.toRadians((double)h3);
        this.Rjaw.rotationPointZ = this.Rsnout.rotationPointZ - (float)Math.cos(this.Rsnout.rotateAngleY);
        this.Rjaw.rotationPointX = this.Rsnout.rotationPointX - (float)Math.sin(this.Rsnout.rotateAngleY);
        this.Rneck.rotateAngleY = (float)Math.toRadians((double)h3)/2.0f;

        Ljx = jx = Rjx = 0;
        if(c.getAttacking() != 0){
            newangle = MathHelper.cos(f2 * 1.9F * this.wingspeed ) * (float)Math.PI * 0.20F;
            Ljx = 0.20f+newangle;
            newangle = MathHelper.cos(f2 * 2.1F * this.wingspeed ) * (float)Math.PI * 0.20F;
            Rjx = 0.20f+newangle;
            newangle = MathHelper.cos(f2 * 2.3F * this.wingspeed ) * (float)Math.PI * 0.20F;
            jx = 0.20f+newangle;

        }
        //Rotate head up/down
        this.head.rotateAngleX = (float)Math.toRadians((double)d2);
        this.snout.rotateAngleX = (float)Math.toRadians((double)d2);
        this.headfin.rotateAngleX = (float)Math.toRadians((double)d2);
        this.jaw.rotateAngleX = (float)Math.toRadians((double)d2)+jx;

        this.Lhead.rotateAngleX = (float)Math.toRadians((double)d1);
        this.Lsnout.rotateAngleX = (float)Math.toRadians((double)d1);
        this.Lheadfin.rotateAngleX = (float)Math.toRadians((double)d1);
        this.Ljaw.rotateAngleX = (float)Math.toRadians((double)d1)+Ljx;

        this.Rhead.rotateAngleX = (float)Math.toRadians((double)d3);
        this.Rsnout.rotateAngleX = (float)Math.toRadians((double)d3);
        this.Rheadfin.rotateAngleX = (float)Math.toRadians((double)d3);
        this.Rjaw.rotateAngleX = (float)Math.toRadians((double)d3)+Rjx;

        //And now, move the whole head forward and back...
        d1 = c.getHead1Ext();
        d2 = c.getHead2Ext();
        d3 = c.getHead3Ext();

        this.Lneck.rotateAngleX = (float)Math.toRadians((double)d1);
        this.neck.rotateAngleX = (float)Math.toRadians((double)d2);
        this.Rneck.rotateAngleX = (float)Math.toRadians((double)d3);

        this.Lhead.rotationPointY = this.Lneck.rotationPointY - (float)Math.cos(this.Lneck.rotateAngleX)*7;
        this.Lheadfin.rotationPointY  = this.Lsnout.rotationPointY = this.Ljaw.rotationPointY = this.Lhead.rotationPointY;
        this.Lhead.rotationPointZ = this.Lneck.rotationPointZ - (float)Math.sin(this.Lneck.rotateAngleX)*7;
        this.Lheadfin.rotationPointZ = this.Lsnout.rotationPointZ = this.Ljaw.rotationPointZ = this.Lhead.rotationPointZ;
        this.Lhead.rotationPointX = this.Lneck.rotationPointX - (float)Math.sin(this.Lneck.rotateAngleY)*7*(float)Math.sin(this.Lneck.rotateAngleX);
        this.Lheadfin.rotationPointX  = this.Lsnout.rotationPointX = this.Ljaw.rotationPointX = this.Lhead.rotationPointX;

        this.Rhead.rotationPointY = this.Rneck.rotationPointY - (float)Math.cos(this.Rneck.rotateAngleX)*7;
        this.Rheadfin.rotationPointY = this.Rsnout.rotationPointY = this.Rjaw.rotationPointY = this.Rhead.rotationPointY;
        this.Rhead.rotationPointZ = this.Rneck.rotationPointZ - (float)Math.sin(this.Rneck.rotateAngleX)*7;
        this.Rheadfin.rotationPointZ = this.Rsnout.rotationPointZ = this.Rjaw.rotationPointZ = this.Rhead.rotationPointZ;
        this.Rhead.rotationPointX = this.Rneck.rotationPointX - (float)Math.sin(this.Rneck.rotateAngleY)*7*(float)Math.sin(this.Rneck.rotateAngleX);
        this.Rheadfin.rotationPointX  = this.Rsnout.rotationPointX = this.Rjaw.rotationPointX = this.Rhead.rotationPointX;

        this.head.rotationPointY = this.neck.rotationPointY - (float)Math.cos(this.neck.rotateAngleX)*7;
        this.headfin.rotationPointY = this.snout.rotationPointY = this.jaw.rotationPointY = this.head.rotationPointY;
        this.head.rotationPointZ = this.neck.rotationPointZ - (float)Math.sin(this.neck.rotateAngleX)*7;
        this.headfin.rotationPointZ = this.snout.rotationPointZ = this.jaw.rotationPointZ = this.head.rotationPointZ;
        this.head.rotationPointX = this.neck.rotationPointX - (float)Math.sin(this.neck.rotateAngleY)*7*(float)Math.sin(this.neck.rotateAngleX);
        this.headfin.rotationPointX  = this.snout.rotationPointX = this.jaw.rotationPointX = this.head.rotationPointX;

        body.render(f5);
        neck1.render(f5);
        neck.render(f5);
        neckbase.render(f5);
        head.render(f5);
        Rleg1.render(f5);
        Lleg1.render(f5);
        snout.render(f5);
        tail1.render(f5);
        tail2.render(f5);
        tail3.render(f5);
        tail4.render(f5);
        Tail5.render(f5);
        Tail6.render(f5);
        Lneck1.render(f5);
        Lneck.render(f5);
        Lhead.render(f5);
        Lsnout.render(f5);
        Rneck1.render(f5);
        Rneck.render(f5);
        Rhead.render(f5);
        Rsnout.render(f5);
        headfin.render(f5);
        Lheadfin.render(f5);
        Rheadfin.render(f5);
        Backfin.render(f5);
        Ljaw.render(f5);
        jaw.render(f5);
        Rjaw.render(f5);

//        GL11.glPushMatrix();
//        GL11.glEnable(GL11.GL_NORMALIZE);
//        GL11.glEnable(GL11.GL_BLEND);
//        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        //OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240f, 240f); //Makes wings glow in the dark!
//        GL11.glColor4f(0.75F, 0.75F, 0.75F, 0.55F);
        Rwing2.render(f5);
        Rwing3.render(f5);
        Lwing2.render(f5);
        Lwing3.render(f5);
        Lwing.render(f5);
        Rwing.render(f5);
//        GL11.glDisable(GL11.GL_BLEND);
//        GL11.glPopMatrix();
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
    {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}
