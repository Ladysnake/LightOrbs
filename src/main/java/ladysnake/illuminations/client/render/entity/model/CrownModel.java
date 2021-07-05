// Made with Model Converter by Globox_Z
// Generate all required imports
// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
package ladysnake.illuminations.client.render.entity.model;

import ladysnake.illuminations.client.IlluminationsClient;
import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class CrownModel extends OverheadModel {
    public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(new Identifier(IlluminationsClient.MODID, "crown"), "main");

    private final ModelPart crown;
    private final ModelPart west_r1;
    private final ModelPart north_r1;
    private final ModelPart east_r1;
    private final ModelPart south_r1;

    public CrownModel(EntityRendererFactory.Context ctx) {
        super(ctx);

        this.crown = this.head.getChild("crown");
        this.south_r1 = this.crown.getChild("south_r1");
        this.east_r1 = this.crown.getChild("east_r1");
        this.north_r1 = this.crown.getChild("north_r1");
        this.west_r1 = this.crown.getChild("west_r1");
        setRotationAngle(west_r1, -0.2618F, 1.5708F, 0.0F);
        setRotationAngle(north_r1, -0.2618F, 3.1416F, 0.0F);
        setRotationAngle(east_r1, -0.2618F, -1.5708F, 0.0F);
        setRotationAngle(south_r1, -0.2618F, 0.0F, 0.0F);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData modelPartData1 = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 7).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        ModelPartData modelPartData2 = modelPartData1.addChild("crown", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -13.0F, -4.0F, 8.0F, 8.0F, 8.0F), ModelTransform.pivot(0.0F, -4.0F, 0.0F));
        modelPartData2.addChild("west_r1", ModelPartBuilder.create().uv(7, 39).cuboid(-4.0F, -8.0F, 3.0F, 8.0F, 8.0F, 1.0F), ModelTransform.pivot(0.0F, -7.0F, 0.0F));
        modelPartData2.addChild("north_r1", ModelPartBuilder.create().uv(7, 15).cuboid(-4.0F, -8.0F, 3.0F, 8.0F, 8.0F, 1.0F), ModelTransform.pivot(0.0F, -7.0F, 0.0F));
        modelPartData2.addChild("east_r1", ModelPartBuilder.create().uv(7, 23).cuboid(-4.0F, -8.0F, 3.0F, 8.0F, 8.0F, 1.0F), ModelTransform.pivot(0.0F, -7.0F, 0.0F));
        modelPartData2.addChild("south_r1", ModelPartBuilder.create().uv(7, 31).cuboid(-4.0F, -8.0F, 3.0F, 8.0F, 8.0F, 1.0F), ModelTransform.pivot(0.0F, -7.0F, 0.0F));
        return TexturedModelData.of(modelData, 32, 32);
    }

    @Override
    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        head.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }
}