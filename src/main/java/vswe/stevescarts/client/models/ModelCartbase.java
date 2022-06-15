package vswe.stevescarts.client.models;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.pipeline.VertexBufferConsumer;
import org.jetbrains.annotations.NotNull;
import vswe.stevescarts.modules.ModuleBase;

import java.util.ArrayList;
import java.util.function.Function;

public abstract class ModelCartbase extends Model
{
    protected final ResourceLocation texture;
    protected final ModelPart root;

    public ModelCartbase(Function<ResourceLocation, RenderType> layerFactory, ResourceLocation texture, ModelPart root)
    {
        super(layerFactory);
        this.texture = texture;
        this.root = root;
    }

    public ModelCartbase(ModelPart root, ResourceLocation texture)
    {
        this(RenderType::entityCutoutNoCull, texture, root);
    }

    @Deprecated(forRemoval = true)
    public ModelCartbase()
    {
        super(null);
        this.texture = null;
        this.root = null;
    }

    @Deprecated(forRemoval = true)
    public final void render(PoseStack matrices, VertexConsumer vertexConsumers, int light, int overlay, float red, float green, float blue, float alpha)
    {
        //TODO
//        this.root.render(matrices, vertexConsumers.getBuffer(this.getLayer(this.texture)), light, overlay, red, green, blue, alpha);
    }

    @Override
    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumers, int light, int overlay, float red, float green, float blue, float alpha)
    {
        if(this.root != null)
        {
            this.root.render(poseStack, vertexConsumers, light, overlay, red, green, blue, alpha);
        }
    }

    public void animateModel(ModuleBase module, float limbAngle, float limbDistance, float tickDelta) {}

    public ResourceLocation getTexture()
    {
        return texture;
    }

    public ModelPart getRoot()
    {
        return root;
    }

    @Deprecated(forRemoval = true)
    protected int getTextureWidth()
    {
        return 64;
    }

    @Deprecated(forRemoval = true)
    protected int getTextureHeight()
    {
        return 64;
    }

    @Deprecated(forRemoval = true)
    public float extraMult()
    {
        return 1.0f;
    }

    @Deprecated(forRemoval = true)
    public ResourceLocation getResource(final ModuleBase module)
    {
        return texture;
    }

    @Deprecated(forRemoval = true)
    public void applyEffects(final ModuleBase module, PoseStack matrixStack, VertexConsumer rtb, final float yaw, final float pitch, final float roll)
    {
    }

    public RenderType getRenderType(ModuleBase moduleBase)
    {
        return RenderType.entitySolid(getResource(moduleBase));
    }
}
