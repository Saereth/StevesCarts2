package vswe.stevescarts.client.models.storages.chests;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexBuffer;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import vswe.stevescarts.client.models.ModelCartbase;
import vswe.stevescarts.helpers.ResourceHelper;
import vswe.stevescarts.modules.ModuleBase;
import vswe.stevescarts.modules.storages.chests.ModuleChest;

public class ModelSideChests extends ModelCartbase
{
    public ModelSideChests()
    {
        super(getTexturedModelData().bakeRoot(), ResourceHelper.getResource("/models/sideChestsModel.png"));
    }

    public static LayerDefinition getTexturedModelData()
    {
        MeshDefinition modelData = new MeshDefinition();
        PartDefinition modelPartData = modelData.getRoot();
        modelPartData.addOrReplaceChild("base_left", CubeListBuilder.create().texOffs(0, 7)
                .addBox(8.0f, 3.0f, 2.0f, 16, 6, 4), PartPose.offset(-16.0f, -5.5f, -14.0f));
        modelPartData.addOrReplaceChild("lid_left", CubeListBuilder.create().texOffs(0, 0)
                .addBox(8.0f, -3.0f, -4.0f, 16, 3, 4), PartPose.offset(-16.0f, -1.5f, -8.0f));
        modelPartData.addOrReplaceChild("lock_left", CubeListBuilder.create().texOffs(0, 17)
                .addBox(-15.0f, -1.5f, -7.5f, 2, 3, 1), PartPose.offset(14.0f, -1.5f, -5.5f));

        modelPartData.addOrReplaceChild("base_right", CubeListBuilder.create().texOffs(0, 7)
                .addBox(8.0f, 3.0f, 2.0f, 16, 6, 4), PartPose.offset(-16.0f, -5.5f, 6.0f));
        modelPartData.addOrReplaceChild("lid_right", CubeListBuilder.create().texOffs(0, 0)
                .addBox(8.0f, -3.0f, -4.0f, 16, 3, 4), PartPose.offset(-16.0f, -1.5f, 12.0f));
//        modelPartData.addOrReplaceChild("lock_right", CubeListBuilder.create().texOffs(0, 17)
//                .addBox(-15.0f, -1.5f, -7.5f, 2, 3, 1), PartPose.offset(14.0f, -1.5f, -5.5f));

        return LayerDefinition.create(modelData, 64, 32);
    }
}
