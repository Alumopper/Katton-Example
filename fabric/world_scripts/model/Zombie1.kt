package model

import net.minecraft.client.model.EntityModel
import net.minecraft.client.model.geom.ModelLayerLocation
import net.minecraft.client.model.geom.ModelPart
import net.minecraft.client.model.geom.PartPose
import net.minecraft.client.model.geom.builders.CubeDeformation
import net.minecraft.client.model.geom.builders.CubeListBuilder
import net.minecraft.client.model.geom.builders.LayerDefinition
import net.minecraft.client.model.geom.builders.MeshDefinition
import net.minecraft.client.renderer.entity.state.EntityRenderState
import top.katton.registry.id

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

class Zombie1Model<T : EntityRenderState>(root: ModelPart) : EntityModel<T>(root) {
    private val root: ModelPart
    private val body: ModelPart
    private val rightarm: ModelPart
    private val rightarm2: ModelPart
    private val weapon: ModelPart
    private val leftarm: ModelPart
    private val leftarm2: ModelPart
    private val head: ModelPart
    private val rightleg: ModelPart
    private val rightleg2: ModelPart
    private val leftleg: ModelPart
    private val leftleg2: ModelPart

    init {
        this.root = root.getChild("root")
        this.body = this.root.getChild("body")
        this.rightarm = this.body.getChild("rightarm")
        this.rightarm2 = this.rightarm.getChild("rightarm2")
        this.weapon = this.rightarm2.getChild("weapon")
        this.leftarm = this.body.getChild("leftarm")
        this.leftarm2 = this.leftarm.getChild("leftarm2")
        this.head = this.body.getChild("head")
        this.rightleg = this.root.getChild("rightleg")
        this.rightleg2 = this.rightleg.getChild("rightleg2")
        this.leftleg = this.root.getChild("leftleg")
        this.leftleg2 = this.leftleg.getChild("leftleg2")
    }

    override fun setupAnim(state: T) {
    }

    companion object {
        // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
        val LAYER_LOCATION: ModelLayerLocation = ModelLayerLocation(id("test", "zombie1"), "main")
        fun createBodyLayer(): LayerDefinition {
            val meshdefinition = MeshDefinition()
            val partdefinition = meshdefinition.getRoot()

            val root = partdefinition.addOrReplaceChild(
                "root",
                CubeListBuilder.create().texOffs(16, 16)
                    .addBox(-4.0f, -3.0f, -2.0f, 8.0f, 6.0f, 4.0f, CubeDeformation(0.0f)),
                PartPose.offset(0.0f, 9.0f, 0.0f)
            )

            val body = root.addOrReplaceChild(
                "body",
                CubeListBuilder.create().texOffs(16, 16)
                    .addBox(-4.0f, -6.0f, -2.0f, 8.0f, 6.0f, 4.0f, CubeDeformation(0.0f)),
                PartPose.offset(0.0f, -3.0f, 0.0f)
            )

            val rightarm = body.addOrReplaceChild(
                "rightarm",
                CubeListBuilder.create().texOffs(40, 16)
                    .addBox(-3.0f, -2.0f, -2.0f, 4.0f, 6.0f, 4.0f, CubeDeformation(0.0f)),
                PartPose.offset(-5.0f, -4.0f, 0.0f)
            )

            val rightarm2 = rightarm.addOrReplaceChild(
                "rightarm2",
                CubeListBuilder.create().texOffs(40, 16)
                    .addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, CubeDeformation(0.0f)),
                PartPose.offset(-1.0f, 4.0f, 0.0f)
            )

            val weapon =
                rightarm2.addOrReplaceChild("weapon", CubeListBuilder.create(), PartPose.offset(0.0f, 3.0f, -10.5f))

            val leftarm = body.addOrReplaceChild(
                "leftarm",
                CubeListBuilder.create().texOffs(40, 16).mirror()
                    .addBox(-1.0f, -2.0f, -2.0f, 4.0f, 6.0f, 4.0f, CubeDeformation(0.0f)).mirror(false),
                PartPose.offset(5.0f, -4.0f, 0.0f)
            )

            val leftarm2 = leftarm.addOrReplaceChild(
                "leftarm2",
                CubeListBuilder.create().texOffs(40, 16).mirror()
                    .addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, CubeDeformation(0.0f)).mirror(false),
                PartPose.offset(1.0f, 4.0f, 0.0f)
            )

            val head = body.addOrReplaceChild(
                "head",
                CubeListBuilder.create().texOffs(0, 0)
                    .addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, CubeDeformation(0.0f))
                    .texOffs(32, 0).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, CubeDeformation(0.5f)),
                PartPose.offset(0.0f, -6.0f, 0.0f)
            )

            val rightleg = root.addOrReplaceChild(
                "rightleg",
                CubeListBuilder.create().texOffs(0, 16)
                    .addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, CubeDeformation(0.0f)),
                PartPose.offset(-1.9f, 3.0f, 0.0f)
            )

            val rightleg2 = rightleg.addOrReplaceChild(
                "rightleg2",
                CubeListBuilder.create().texOffs(0, 16)
                    .addBox(-2.0f, 1.0f, -2.0f, 4.0f, 6.0f, 4.0f, CubeDeformation(0.0f)),
                PartPose.offset(0.0f, 5.0f, 0.0f)
            )

            val leftleg = root.addOrReplaceChild(
                "leftleg",
                CubeListBuilder.create().texOffs(0, 16).mirror()
                    .addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, CubeDeformation(0.0f)).mirror(false),
                PartPose.offset(1.9f, 3.0f, 0.0f)
            )

            val leftleg2 = leftleg.addOrReplaceChild(
                "leftleg2",
                CubeListBuilder.create().texOffs(0, 16).mirror()
                    .addBox(-2.0f, 1.0f, -2.0f, 4.0f, 6.0f, 4.0f, CubeDeformation(0.0f)).mirror(false),
                PartPose.offset(0.0f, 5.0f, 0.0f)
            )

            // Empty display bones referenced by animations
            partdefinition.addOrReplaceChild("item_display", CubeListBuilder.create(), PartPose.offset(0.0f, 0.0f, 0.0f))
            partdefinition.addOrReplaceChild("item_display1", CubeListBuilder.create(), PartPose.offset(0.0f, 0.0f, 0.0f))

            return LayerDefinition.create(meshdefinition, 64, 64)
        }
    }
}