package org.terasology.dangermod.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelRat extends ModelBase {
    private float wingspeed = 1.0F;
    //fields

    ModelRenderer body;
    ModelRenderer tail1;
    ModelRenderer tail2;
    ModelRenderer lfleg;
    ModelRenderer rfleg;
    ModelRenderer lrleg;
    ModelRenderer rrleg;
    ModelRenderer body2;
    ModelRenderer head;
    ModelRenderer nose;
    ModelRenderer lear;
    ModelRenderer rear;

    public ModelRat() {
        float f1 = 1;
        this.wingspeed = f1;

        textureWidth = 64;
        textureHeight = 64;

        body = new ModelRenderer(this, 27, 0);
        body.addBox(-2F, -1F, 0F, 5, 3, 10);
        body.setRotationPoint(0F, 20F, -3F);
        body.setTextureSize(64, 64);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        tail1 = new ModelRenderer(this, 0, 30);
        tail1.addBox(-0.5F, -1F, 0F, 2, 2, 9);
        tail1.setRotationPoint(0F, 21F, 7F);
        tail1.setTextureSize(64, 64);
        tail1.mirror = true;
        setRotation(tail1, 0F, 0F, 0F);
        tail2 = new ModelRenderer(this, 0, 43);
        tail2.addBox(0F, 0F, 0F, 1, 1, 12);
        tail2.setRotationPoint(0F, 21F, 16F);
        tail2.setTextureSize(64, 64);
        tail2.mirror = true;
        setRotation(tail2, 0F, 0F, 0F);
        lfleg = new ModelRenderer(this, 0, 14);
        lfleg.addBox(0F, 0F, 0F, 1, 2, 1);
        lfleg.setRotationPoint(2F, 22F, -2F);
        lfleg.setTextureSize(64, 64);
        lfleg.mirror = true;
        setRotation(lfleg, 0F, 0F, 0F);
        rfleg = new ModelRenderer(this, 10, 14);
        rfleg.addBox(0F, 0F, 0F, 1, 2, 1);
        rfleg.setRotationPoint(-2F, 22F, -2F);
        rfleg.setTextureSize(64, 64);
        rfleg.mirror = true;
        setRotation(rfleg, 0F, 0F, 0F);
        lrleg = new ModelRenderer(this, 0, 18);
        lrleg.addBox(0F, 0F, 0F, 2, 4, 2);
        lrleg.setRotationPoint(2F, 20F, 4F);
        lrleg.setTextureSize(64, 64);
        lrleg.mirror = true;
        setRotation(lrleg, 0F, 0F, 0F);
        rrleg = new ModelRenderer(this, 9, 18);
        rrleg.addBox(0F, 0F, 0F, 2, 4, 2);
        rrleg.setRotationPoint(-3F, 20F, 4F);
        rrleg.setTextureSize(64, 64);
        rrleg.mirror = true;
        setRotation(rrleg, 0F, 0F, 0F);
        body2 = new ModelRenderer(this, 0, 0);
        body2.addBox(0F, 0F, 0F, 1, 1, 6);
        body2.setRotationPoint(0F, 18F, 0F);
        body2.setTextureSize(64, 64);
        body2.mirror = true;
        setRotation(body2, 0F, 0F, 0F);
        head = new ModelRenderer(this, 27, 17);
        head.addBox(-1F, -2F, -3F, 3, 2, 4);
        head.setRotationPoint(0F, 22F, -4F);
        head.setTextureSize(64, 64);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        nose = new ModelRenderer(this, 27, 25);
        nose.addBox(0F, -1F, -5F, 1, 1, 2);
        nose.setRotationPoint(0F, 22F, -4F);
        nose.setTextureSize(64, 64);
        nose.mirror = true;
        setRotation(nose, 0F, 0F, 0F);
        lear = new ModelRenderer(this, 0, 9);
        lear.addBox(0F, 0F, 0F, 1, 1, 1);
        lear.setRotationPoint(1.5F, 19.5F, -4F);
        lear.setTextureSize(64, 64);
        lear.mirror = true;
        setRotation(lear, 0F, 0F, 0F);
        rear = new ModelRenderer(this, 5, 9);
        rear.addBox(0F, 0F, 0F, 1, 1, 1);
        rear.setRotationPoint(-1.5F, 19.5F, -4F);
        rear.setTextureSize(64, 64);
        rear.mirror = true;
        setRotation(rear, 0F, 0F, 0F);


    }

    //f1 is scaled for movement speed! Yay!
    public void render(Entity e, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(e, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, e);

        float newangle = 0;
        //System.out.printf("floats: %f,  %f, %f, %f, %f, %f\n", f, f1, f2, f3, f4, f5);
        if (f1 > 0.1) {
            newangle = MathHelper.cos(f2 * 1.7F * this.wingspeed) * (float) Math.PI * 0.25F * f1;
        } else {
            newangle = 0.0F;
        }

        this.rfleg.rotateAngleX = newangle;
        this.lfleg.rotateAngleX = -newangle;
        this.rrleg.rotateAngleX = -newangle;
        this.lrleg.rotateAngleX = newangle;

        if (e.getAttacking() != 0) {
            newangle = MathHelper.cos(f2 * 1.5F * this.wingspeed) * (float) Math.PI * 0.25F;
        } else {
            newangle = MathHelper.cos(f2 * 0.4F * this.wingspeed) * (float) Math.PI * 0.05F;
        }
        this.tail1.rotateAngleY = newangle * 0.5F;
        this.tail2.rotateAngleY = newangle * 1.25F;
        this.tail2.rotationPointZ = this.tail1.rotationPointZ + (float) Math.cos(this.tail1.rotateAngleY) * 9;
        this.tail2.rotationPointX = this.tail1.rotationPointX + (float) Math.sin(this.tail1.rotateAngleY) * 9;


        body.render(f5);
        tail1.render(f5);
        tail2.render(f5);
        lfleg.render(f5);
        rfleg.render(f5);
        lrleg.render(f5);
        rrleg.render(f5);
        body2.render(f5);
        head.render(f5);
        nose.render(f5);
        lear.render(f5);
        rear.render(f5);

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

