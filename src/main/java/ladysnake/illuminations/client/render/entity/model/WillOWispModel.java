//// Made with Model Converter by Globox_Z
//// Generate all required imports
//// Made with Blockbench 3.8.4
//// Exported for Minecraft version 1.15
//// Paste this class into your mod and generate all required imports
//package ladysnake.illuminations.client.render.entity.model;
//import net.minecraft.client.model.Model;
//public class WillOWispModel extends Model {
//    private final ModelPart skull;
//    public WillOWispModel(ModelPart root) {
//this.skull = root.getChild("skull");
//}
//public static TexturedModelData getTexturedModelData() {
//ModelData modelData = new ModelData();
//ModelPartData modelPartData = modelData.getRoot();
//    }
//modelPartData.addChild("skull", ModelPartBuilder.create().uv(0,0).cuboid(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F).uv(0,16).cuboid(-3.0F, -3.0F, -3.0F, 6.0F, 7.0F, 6.0F, 0.25F, false), ModelTransform.pivot(0.0F,16.0F,0.0F));
//return TexturedModelData.of(modelData,32,32);
//    @Override
//    public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
//        //previously the render function, render code was moved to a method below
//    }
//    @Override
//    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
//        skull.render(matrixStack, buffer, packedLight, packedOverlay);
//    }
//    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
//        bone.pitch = x;
//        bone.yaw = y;
//        bone.roll = z;
//    }
//}