package org.terasology.dangermod.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCrab extends ModelBase {
    //fields
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer leg1;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer body5;
    ModelRenderer body6;
    ModelRenderer Leye1;
    ModelRenderer Reye1;
    ModelRenderer Leye2;
    ModelRenderer Reye2;
    ModelRenderer Lclaw1;
    ModelRenderer Lclaw2;
    ModelRenderer Lclaw3;
    ModelRenderer Lclaw4;
    ModelRenderer Lclaw5;
    ModelRenderer Rclaw1;
    ModelRenderer Rclaw2;
    ModelRenderer Rclaw3;
    ModelRenderer Rclaw4;
    ModelRenderer Rclaw5;
    ModelRenderer Rmouth;
    ModelRenderer Lmouth;

    public ModelCrab() {
        float f = 1;
        textureWidth = 256;
        textureHeight = 512;

        body1 = new ModelRenderer(this, 0, 450);
        body1.addBox(-38F, -5F, -8F, 76, 10, 48);
        body1.setRotationPoint(0F, 0F, 0F);
        body1.setTextureSize(64, 32);
        body1.mirror = true;
        setRotation(body1, 0F, 0F, 0F);
        body2 = new ModelRenderer(this, 0, 406);
        body2.addBox(-32F, -10F, -10F, 64, 5, 34);
        body2.setRotationPoint(0F, 0F, 0F);
        body2.setTextureSize(64, 32);
        body2.mirror = true;
        setRotation(body2, 0F, 0F, 0F);
        leg1 = new ModelRenderer(this, 128, 0);
        leg1.addBox(-2F, 0F, -2F, 4, 12, 4);
        leg1.setRotationPoint(36F, 3F, 0F);
        leg1.setTextureSize(64, 32);
        leg1.mirror = true;
        setRotation(leg1, -1.343904F, -1.500983F, 0F);
        body3 = new ModelRenderer(this, 0, 357);
        body3.addBox(0F, 0F, 0F, 8, 4, 40);
        body3.setRotationPoint(38F, -5F, -6F);
        body3.setTextureSize(64, 32);
        body3.mirror = true;
        setRotation(body3, 0F, 0F, 0F);
        body4 = new ModelRenderer(this, 100, 357);
        body4.addBox(0F, 0F, 0F, 8, 4, 40);
        body4.setRotationPoint(-46F, -5F, -6F);
        body4.setTextureSize(64, 32);
        body4.mirror = true;
        setRotation(body4, 0F, 0F, 0F);
        leg2 = new ModelRenderer(this, 128, 20);
        leg2.addBox(-1F, 10F, -6F, 3, 16, 3);
        leg2.setRotationPoint(36F, 3F, 0F);
        leg2.setTextureSize(256, 512);
        leg2.mirror = true;
        setRotation(leg2, -0.9599311F, -1.500983F, 0F);
        leg3 = new ModelRenderer(this, 128, 43);
        leg3.addBox(0F, 21F, -15F, 2, 16, 2);
        leg3.setRotationPoint(36F, 3F, 0F);
        leg3.setTextureSize(256, 512);
        leg3.mirror = true;
        setRotation(leg3, -0.5759587F, -1.500983F, 0F);
        body5 = new ModelRenderer(this, 0, 339);
        body5.addBox(-25F, 0F, 0F, 50, 4, 10);
        body5.setRotationPoint(0F, -4F, 40F);
        body5.setTextureSize(64, 32);
        body5.mirror = true;
        setRotation(body5, 0F, 0F, 0F);
        body6 = new ModelRenderer(this, 124, 342);
        body6.addBox(-14F, 0F, 0F, 28, 3, 4);
        body6.setRotationPoint(0F, -10F, -14F);
        body6.setTextureSize(64, 32);
        body6.mirror = true;
        setRotation(body6, 0F, 0F, 0F);
        Leye1 = new ModelRenderer(this, 62, 0);
        Leye1.addBox(-0.5F, -12F, -0.5F, 1, 12, 1);
        Leye1.setRotationPoint(9F, -9F, -11F);
        Leye1.setTextureSize(64, 32);
        Leye1.mirror = true;
        setRotation(Leye1, 0F, 0F, 0.4886922F);
        Reye1 = new ModelRenderer(this, 40, 0);
        Reye1.addBox(-0.5F, -12F, -0.5F, 1, 12, 1);
        Reye1.setRotationPoint(-9F, -9F, -11F);
        Reye1.setTextureSize(64, 32);
        Reye1.mirror = true;
        setRotation(Reye1, 0F, 0F, -0.4886922F);
        Leye2 = new ModelRenderer(this, 50, 0);
        Leye2.addBox(-1F, -14F, -1F, 2, 2, 2);
        Leye2.setRotationPoint(9F, -9F, -11F);
        Leye2.setTextureSize(64, 32);
        Leye2.mirror = true;
        setRotation(Leye2, 0F, 0F, 0.4886922F);
        Reye2 = new ModelRenderer(this, 26, 0);
        Reye2.addBox(-1F, -14F, -1F, 2, 2, 2);
        Reye2.setRotationPoint(-9F, -9F, -11F);
        Reye2.setTextureSize(64, 32);
        Reye2.mirror = true;
        setRotation(Reye2, 0F, 0F, -0.4886922F);
        Lclaw1 = new ModelRenderer(this, 0, 80);
        Lclaw1.addBox(-4F, 0F, -14F, 8, 4, 18);
        Lclaw1.setRotationPoint(31F, -2F, -8F);
        Lclaw1.setTextureSize(64, 32);
        Lclaw1.mirror = true;
        setRotation(Lclaw1, 0F, -0.4886922F, 0F);
        Lclaw2 = new ModelRenderer(this, 0, 105);
        Lclaw2.addBox(-7F, -3F, -12F, 17, 6, 16);
        Lclaw2.setRotationPoint(37F, 0F, -20F);
        Lclaw2.setTextureSize(64, 32);
        Lclaw2.mirror = true;
        setRotation(Lclaw2, 0F, -0.1745329F, 0F);
        Lclaw3 = new ModelRenderer(this, 0, 131);
        Lclaw3.addBox(0F, -5F, -25F, 17, 10, 30);
        Lclaw3.setRotationPoint(37F, 0F, -31F);
        Lclaw3.setTextureSize(64, 32);
        Lclaw3.mirror = true;
        setRotation(Lclaw3, 0F, -0.4537856F, 0F);
        Lclaw4 = new ModelRenderer(this, 0, 175);
        Lclaw4.addBox(2F, -3F, -32F, 11, 5, 12);
        Lclaw4.setRotationPoint(37F, 0F, -31F);
        Lclaw4.setTextureSize(64, 32);
        Lclaw4.mirror = true;
        setRotation(Lclaw4, 0F, -0.3490659F, 0F);
        Lclaw5 = new ModelRenderer(this, 0, 197);
        Lclaw5.addBox(-4F, -3F, -27F, 7, 5, 32);
        Lclaw5.setRotationPoint(36F, 0F, -31F);
        Lclaw5.setTextureSize(64, 32);
        Lclaw5.mirror = true;
        setRotation(Lclaw5, 0F, 0.3839724F, 0F);
        Rclaw1 = new ModelRenderer(this, 102, 78);
        Rclaw1.addBox(-4F, 0F, -14F, 8, 4, 18);
        Rclaw1.setRotationPoint(-31F, -2F, -8F);
        Rclaw1.setTextureSize(64, 32);
        Rclaw1.mirror = true;
        setRotation(Rclaw1, 0F, 0.4886922F, 0F);
        Rclaw2 = new ModelRenderer(this, 103, 106);
        Rclaw2.addBox(-10F, -3F, -12F, 17, 6, 16);
        Rclaw2.setRotationPoint(-37F, 0F, -20F);
        Rclaw2.setTextureSize(64, 32);
        Rclaw2.mirror = true;
        setRotation(Rclaw2, 0F, 0.1745329F, 0F);
        Rclaw3 = new ModelRenderer(this, 100, 131);
        Rclaw3.addBox(-17F, -5F, -25F, 17, 10, 30);
        Rclaw3.setRotationPoint(-37F, 0F, -31F);
        Rclaw3.setTextureSize(64, 32);
        Rclaw3.mirror = true;
        setRotation(Rclaw3, 0F, 0.4537856F, 0F);
        Rclaw4 = new ModelRenderer(this, 101, 175);
        Rclaw4.addBox(-13F, -3F, -32F, 11, 5, 12);
        Rclaw4.setRotationPoint(-37F, 0F, -31F);
        Rclaw4.setTextureSize(64, 32);
        Rclaw4.mirror = true;
        setRotation(Rclaw4, 0F, 0.3490659F, 0F);
        Rclaw5 = new ModelRenderer(this, 100, 197);
        Rclaw5.addBox(-4F, -3F, -27F, 7, 5, 32);
        Rclaw5.setRotationPoint(-36F, 0F, -31F);
        Rclaw5.setTextureSize(64, 32);
        Rclaw5.mirror = true;
        setRotation(Rclaw5, 0F, -0.3839724F, 0F);
        Rmouth = new ModelRenderer(this, 0, 28);
        Rmouth.addBox(0F, 0F, -0.5F, 6, 3, 1);
        Rmouth.setRotationPoint(-7F, 0F, -7.5F);
        Rmouth.setTextureSize(256, 512);
        Rmouth.mirror = true;
        setRotation(Rmouth, 0F, 0.3665191F, 0F);
        Lmouth = new ModelRenderer(this, 0, 19);
        Lmouth.addBox(-6F, 0F, -0.5F, 6, 3, 1);
        Lmouth.setRotationPoint(7F, 0F, -7.5F);
        Lmouth.setTextureSize(256, 512);
        Lmouth.mirror = true;
        setRotation(Lmouth, 0F, -0.3665191F, 0F);
    }

    public void render(Entity e, float f, float f1, float f2, float f3, float f4, float f5) {
        float newangle;
        super.render(e, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, e);
    
    /*
    //Yes, it's supposed to be rotateAngleY, but this still works and looks pretty cool
    this.llegtop1.rotateAngleX = MathHelper.cos(f2 * 2.7F) * (float)Math.PI * 0.45F * f1;
    this.llegbot1.rotateAngleX = this.llegtop1.rotateAngleX;
    this.rlegtop2.rotateAngleX = this.llegtop1.rotateAngleX;
    this.rlegbot2.rotateAngleX = this.llegtop1.rotateAngleX;
    this.rlegtop3.rotateAngleX = this.llegtop1.rotateAngleX;
    this.rlegbot3.rotateAngleX = this.llegtop1.rotateAngleX;
    
    this.rlegtop1.rotateAngleX = -this.llegtop1.rotateAngleX;
    this.rlegbot1.rotateAngleX = -this.llegtop1.rotateAngleX;
    this.llegtop2.rotateAngleX = -this.llegtop1.rotateAngleX;
    this.llegbot2.rotateAngleX = -this.llegtop1.rotateAngleX;
    this.llegtop3.rotateAngleX = -this.llegtop1.rotateAngleX;
    this.llegbot3.rotateAngleX = -this.llegtop1.rotateAngleX;
    
    this.jawsl.rotateAngleY = MathHelper.cos(f2 * 0.4F) * (float)Math.PI * 0.05F;
    this.jawsr.rotateAngleY = -this.jawsl.rotateAngleY;
    */

        leg1.rotationPointX = leg2.rotationPointX = leg3.rotationPointX = 36f;
        leg1.rotationPointY = leg2.rotationPointY = leg3.rotationPointY = 3f;
        leg1.rotationPointZ = leg2.rotationPointZ = leg3.rotationPointZ = 0;
        leg1.rotateAngleY = leg2.rotateAngleY = leg3.rotateAngleY = (float) (-Math.PI / 2 + MathHelper.cos(f2 * 1.7F) * (float) Math.PI * 0.15F * f1);
        leg1.render(f5);
        leg2.render(f5);
        leg3.render(f5);

        leg1.rotationPointZ = leg2.rotationPointZ = leg3.rotationPointZ = 10;
        leg1.rotateAngleY = leg2.rotateAngleY = leg3.rotateAngleY = (float) (-Math.PI / 2 - MathHelper.cos(f2 * 1.7F) * (float) Math.PI * 0.15F * f1);
        leg1.render(f5);
        leg2.render(f5);
        leg3.render(f5);

        leg1.rotationPointZ = leg2.rotationPointZ = leg3.rotationPointZ = 20;
        leg1.rotateAngleY = leg2.rotateAngleY = leg3.rotateAngleY = (float) (-Math.PI / 2 + MathHelper.cos(f2 * 1.7F) * (float) Math.PI * 0.15F * f1);
        leg1.render(f5);
        leg2.render(f5);
        leg3.render(f5);

        leg1.rotationPointZ = leg2.rotationPointZ = leg3.rotationPointZ = 30;
        leg1.rotateAngleY = leg2.rotateAngleY = leg3.rotateAngleY = (float) (-Math.PI / 2 - MathHelper.cos(f2 * 1.7F) * (float) Math.PI * 0.15F * f1);
        leg1.render(f5);
        leg2.render(f5);
        leg3.render(f5);

        leg1.rotationPointX = leg2.rotationPointX = leg3.rotationPointX = -36f;
        leg1.rotationPointY = leg2.rotationPointY = leg3.rotationPointY = 3f;
        leg1.rotationPointZ = leg2.rotationPointZ = leg3.rotationPointZ = 0;
        leg1.rotateAngleY = leg2.rotateAngleY = leg3.rotateAngleY = (float) -(-Math.PI / 2 + MathHelper.cos(f2 * 1.7F) * (float) Math.PI * 0.15F * f1);
        leg1.render(f5);
        leg2.render(f5);
        leg3.render(f5);

        leg1.rotationPointZ = leg2.rotationPointZ = leg3.rotationPointZ = 10;
        leg1.rotateAngleY = leg2.rotateAngleY = leg3.rotateAngleY = (float) -(-Math.PI / 2 - MathHelper.cos(f2 * 1.7F) * (float) Math.PI * 0.15F * f1);
        leg1.render(f5);
        leg2.render(f5);
        leg3.render(f5);

        leg1.rotationPointZ = leg2.rotationPointZ = leg3.rotationPointZ = 20;
        leg1.rotateAngleY = leg2.rotateAngleY = leg3.rotateAngleY = (float) -(-Math.PI / 2 + MathHelper.cos(f2 * 1.7F) * (float) Math.PI * 0.15F * f1);
        leg1.render(f5);
        leg2.render(f5);
        leg3.render(f5);

        leg1.rotationPointZ = leg2.rotationPointZ = leg3.rotationPointZ = 30;
        leg1.rotateAngleY = leg2.rotateAngleY = leg3.rotateAngleY = (float) -(-Math.PI / 2 - MathHelper.cos(f2 * 1.7F) * (float) Math.PI * 0.15F * f1);
        leg1.render(f5);
        leg2.render(f5);
        leg3.render(f5);

        if (e.getAttacking() == 0) {
            Leye1.rotateAngleX = Leye2.rotateAngleX = (MathHelper.cos(f2 * 0.35F) * (float) Math.PI * 0.05F);
            Leye1.rotateAngleZ = Leye2.rotateAngleZ = 0.54f + (MathHelper.cos(f2 * 0.25F) * (float) Math.PI * 0.05F);
            Reye1.rotateAngleX = Reye2.rotateAngleX = (MathHelper.cos(f2 * 0.30F) * (float) Math.PI * 0.05F);
            Reye1.rotateAngleZ = Reye2.rotateAngleZ = -0.54f + (MathHelper.cos(f2 * 0.45F) * (float) Math.PI * 0.05F);
            Lmouth.rotateAngleY = -0.72f + (MathHelper.cos(f2 * 0.25F) * (float) Math.PI * 0.05F);
            Rmouth.rotateAngleY = 0.72f - (MathHelper.cos(f2 * 0.25F) * (float) Math.PI * 0.05F);
            newangle = (MathHelper.cos(f2 * 0.15F) * (float) Math.PI * 0.03F);
            Lclaw3.rotateAngleY = -0.453f + newangle;
            Lclaw4.rotateAngleY = -0.349f + newangle;
            Lclaw5.rotateAngleY = 0.384f - newangle;
            newangle = (MathHelper.cos(f2 * 0.13F) * (float) Math.PI * 0.02F);
            Rclaw3.rotateAngleY = 0.453f + newangle;
            Rclaw4.rotateAngleY = 0.349f + newangle;
            Rclaw5.rotateAngleY = -0.384f - newangle;
        } else {
            Leye1.rotateAngleX = Leye2.rotateAngleX = (MathHelper.cos(f2 * 0.45F) * (float) Math.PI * 0.10F);
            Leye1.rotateAngleZ = Leye2.rotateAngleZ = 0.54f + (MathHelper.cos(f2 * 0.35F) * (float) Math.PI * 0.10F);
            Reye1.rotateAngleX = Reye2.rotateAngleX = (MathHelper.cos(f2 * 0.40F) * (float) Math.PI * 0.10F);
            Reye1.rotateAngleZ = Reye2.rotateAngleZ = -0.54f + (MathHelper.cos(f2 * 0.55F) * (float) Math.PI * 0.10F);
            Lmouth.rotateAngleY = -0.72f + (MathHelper.cos(f2 * 0.45F) * (float) Math.PI * 0.15F);
            Rmouth.rotateAngleY = 0.72f - (MathHelper.cos(f2 * 0.45F) * (float) Math.PI * 0.15F);
            newangle = (MathHelper.cos(f2 * 0.35F) * (float) Math.PI * 0.13F);
            Lclaw3.rotateAngleY = -0.453f + newangle;
            Lclaw4.rotateAngleY = -0.349f + newangle;
            Lclaw5.rotateAngleY = 0.384f - newangle;
            newangle = (MathHelper.cos(f2 * 0.43F) * (float) Math.PI * 0.12F);
            Rclaw3.rotateAngleY = 0.453f + newangle;
            Rclaw4.rotateAngleY = 0.349f + newangle;
            Rclaw5.rotateAngleY = -0.384f - newangle;
        }


        body1.render(f5);
        body2.render(f5);

        body3.render(f5);
        body4.render(f5);
        leg2.render(f5);
        leg3.render(f5);
        body5.render(f5);
        body6.render(f5);
        Leye1.render(f5);
        Reye1.render(f5);
        Leye2.render(f5);
        Reye2.render(f5);
        Lclaw1.render(f5);
        Lclaw2.render(f5);
        Lclaw3.render(f5);
        Lclaw4.render(f5);
        Lclaw5.render(f5);
        Rclaw1.render(f5);
        Rclaw2.render(f5);
        Rclaw3.render(f5);
        Rclaw4.render(f5);
        Rclaw5.render(f5);
        Rmouth.render(f5);
        Lmouth.render(f5);
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


