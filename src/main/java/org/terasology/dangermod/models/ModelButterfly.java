
package org.terasology.dangermod.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelButterfly extends ModelBase {
    //fields
    ModelRenderer body;
    ModelRenderer leftwing;
    ModelRenderer rightwing;
    ModelRenderer leftwing2;
    ModelRenderer rightwing2;
    ModelRenderer leftwing3;
    ModelRenderer rightwing3;
    ModelRenderer head;
    ModelRenderer leftwing4;
    ModelRenderer rightwing4;
    private float wingspeed = 1.0F;

    public ModelButterfly() {
        float f1 = 1;
        textureWidth = 64;
        textureHeight = 32;
        this.wingspeed = f1;

        body = new ModelRenderer(this, 21, 19);
        body.addBox(0F, 0F, -4F, 1, 1, 8);
        body.setRotationPoint(0F, 17F, 0F);
        body.setTextureSize(64, 32);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        leftwing = new ModelRenderer(this, 43, 24);
        leftwing.addBox(0F, 0F, -4F, 5, 1, 5);
        leftwing.setRotationPoint(1F, 17F, 0F);
        leftwing.setTextureSize(64, 32);
        leftwing.mirror = true;
        setRotation(leftwing, 0F, 0F, 0F);
        rightwing = new ModelRenderer(this, 43, 17);
        rightwing.addBox(-5F, 0F, -4F, 5, 1, 5);
        rightwing.setRotationPoint(0F, 17F, 0F);
        rightwing.setTextureSize(64, 32);
        rightwing.mirror = true;
        setRotation(rightwing, 0F, 0F, 0F);
        leftwing2 = new ModelRenderer(this, 0, 0);
        leftwing2.addBox(1F, 0F, -6F, 6, 1, 7);
        leftwing2.setRotationPoint(1F, 17F, 0F);
        leftwing2.setTextureSize(64, 32);
        leftwing2.mirror = true;
        setRotation(leftwing2, 0F, 0F, 0F);
        rightwing2 = new ModelRenderer(this, 29, 0);
        rightwing2.addBox(-7F, 0F, -6F, 6, 1, 7);
        rightwing2.setRotationPoint(0F, 17F, 0F);
        rightwing2.setTextureSize(64, 32);
        rightwing2.mirror = true;
        setRotation(rightwing2, 0F, 0F, 0F);
        leftwing3 = new ModelRenderer(this, 0, 9);
        leftwing3.addBox(0F, 0F, 1F, 5, 1, 5);
        leftwing3.setRotationPoint(1F, 17F, 0F);
        leftwing3.setTextureSize(64, 32);
        leftwing3.mirror = true;
        setRotation(leftwing3, 0F, 0F, 0F);
        rightwing3 = new ModelRenderer(this, 27, 9);
        rightwing3.addBox(-5F, 0F, 1F, 5, 1, 5);
        rightwing3.setRotationPoint(0F, 17F, 0F);
        rightwing3.setTextureSize(64, 32);
        rightwing3.mirror = true;
        setRotation(rightwing3, 0F, 0F, 0F);
        head = new ModelRenderer(this, 21, 11);
        head.addBox(0F, 0F, -6F, 1, 1, 1);
        head.setRotationPoint(0F, 17F, 1F);
        head.setTextureSize(64, 32);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        leftwing4 = new ModelRenderer(this, 2, 24);
        leftwing4.addBox(0F, 0F, 6F, 1, 1, 7);
        leftwing4.setRotationPoint(1F, 17F, 0F);
        leftwing4.setTextureSize(64, 32);
        leftwing4.mirror = true;
        setRotation(leftwing4, 0F, 0F, 0F);
        rightwing4 = new ModelRenderer(this, 2, 16);
        rightwing4.addBox(-1F, 0F, 6F, 1, 1, 7);
        rightwing4.setRotationPoint(0F, 17F, 0F);
        rightwing4.setTextureSize(64, 32);
        rightwing4.mirror = true;
        setRotation(rightwing4, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        head.render(f5);
        body.render(f5);

        this.rightwing.rotateAngleZ = MathHelper.cos(f2 * 1.3F * this.wingspeed) * (float) Math.PI * 0.25F;
        this.rightwing2.rotateAngleZ = this.rightwing.rotateAngleZ;
        this.rightwing3.rotateAngleZ = this.rightwing.rotateAngleZ;
        this.rightwing4.rotateAngleZ = this.rightwing.rotateAngleZ;

        this.leftwing.rotateAngleZ = -this.rightwing.rotateAngleZ;
        this.leftwing2.rotateAngleZ = -this.rightwing.rotateAngleZ;
        this.leftwing3.rotateAngleZ = -this.rightwing.rotateAngleZ;
        this.leftwing4.rotateAngleZ = -this.rightwing.rotateAngleZ;

        leftwing.render(f5);
        rightwing.render(f5);
        leftwing2.render(f5);
        rightwing2.render(f5);
        leftwing3.render(f5);
        rightwing3.render(f5);
        leftwing4.render(f5);
        rightwing4.render(f5);

    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }


}

