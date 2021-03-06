package ua.pp.shurgent.tfctech.render;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;
import ua.pp.shurgent.tfctech.core.ModBlocks;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class RenderInductionSmelter implements ISimpleBlockRenderingHandler {
	
	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer) {
	}
	
	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		return false;
	}
	
	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		return false;
	}
	
	@Override
	public int getRenderId() {
		return ModBlocks.inductionSmelterRenderId;
	}
	
}
