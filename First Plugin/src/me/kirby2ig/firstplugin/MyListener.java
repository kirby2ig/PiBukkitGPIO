package me.kirby2ig.firstplugin;

import java.util.HashSet;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.material.Wool;
public class MyListener implements Listener {
    
	Gpioclass gpio = new Gpioclass();
	
	public MyListener(FirstPlugin plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
		
      }
      
	
	
	@EventHandler
    public void onBlockRedstone(BlockRedstoneEvent e) {
              Block triggeringBlock = e.getBlock();

              // Block b must a redstonewire, a redstone torch, a lever, or button
                    final BlockFace adjFaces[] = { BlockFace.NORTH, BlockFace.EAST,
                                  BlockFace.SOUTH, BlockFace.WEST, BlockFace.UP,
                                  BlockFace.DOWN };

                    for (BlockFace bf : adjFaces) {
                          Block adjBlock = triggeringBlock.getRelative(bf);
                          if (adjBlock.getType() == Material.WOOL) {
                                  blocksWaitingForPhysicsEvent.add(adjBlock);
                    }
              }
      }
      private HashSet<Block> blocksWaitingForPhysicsEvent = new HashSet<Block>();
      @EventHandler
      public void onBlockPhysics(BlockPhysicsEvent e) {
              Block b = e.getBlock();
              if (b.getType() == Material.WOOL) // or whatever type block you
                                                // are interested in ....
              {
                    if (blocksWaitingForPhysicsEvent.contains(b)) {
                          blocksWaitingForPhysicsEvent.remove(b);
                          doPowerup(b);
                    }
              }
              if (b.getType() == Material.DIODE_BLOCK_ON || b.getType() == Material.DIODE_BLOCK_OFF) {
                    final BlockFace nsewFaces[] = { BlockFace.NORTH, BlockFace.EAST,
                                  BlockFace.SOUTH, BlockFace.WEST };
                    for (BlockFace bf : nsewFaces) {
                          if (b.isBlockFacePowered(bf)) {
                                  Block rc = b.getRelative(bf);
                                  if (rc.getType() == Material.WOOL)
                                                                    // or whatever type
                                                                    // block you are
                                                                    // interested in
                                                                    // ....
                                        blocksWaitingForPhysicsEvent.add(rc);
                          }
                    }
              }
      }
      private void doPowerup(Block b) {
    	  DyeColor color = ((Wool)b.getState().getData()).getColor();    
    	  if (!b.isBlockPowered()) {
  				if (color == DyeColor.WHITE) {
  					gpio.Output(1, false);
  				}
  				else if (color == DyeColor.ORANGE) {
  					gpio.Output(2, false);
  				}
  				else if (color == DyeColor.MAGENTA) {
  					gpio.Output(3, false);
  				}
  				else if (color == DyeColor.LIGHT_BLUE) {
  					gpio.Output(4, false);
  				}
  				else if (color == DyeColor.YELLOW) {
  					gpio.Output(5, false);
  				}
  				else if (color == DyeColor.LIME) {
  					gpio.Output(6, false);
  				}
  				else if (color == DyeColor.PINK) {
  					gpio.Output(7, false);
  				}
  				else if (color == DyeColor.GRAY) {
  					gpio.Output(8, false);
  				}
  				else if (color == DyeColor.SILVER) {
  					gpio.Output(9, false);
  				}
  				else if (color == DyeColor.CYAN) {
  					gpio.Output(10, false);
  				}
  				else if (color == DyeColor.PURPLE) {
  					gpio.Output(11, false);
  				}
  				else if (color == DyeColor.BLUE) {
  					gpio.Output(12, false);
  				}
  				else if (color == DyeColor.BROWN) {
  					gpio.Output(13, false);
  				}
  				else if (color == DyeColor.GREEN) {
  					gpio.Output(14, false);
  				}
  				else if (color == DyeColor.RED) {
  					gpio.Output(15, false);
  				}
  				else if (color == DyeColor.BLACK) {
  					gpio.Output(16, false);
  				}
  			
    	  }
    	  if (b.isBlockPowered()) {
    		  if (color == DyeColor.WHITE) {
					gpio.Output(1, true);
				}
				else if (color == DyeColor.ORANGE) {
					gpio.Output(2, true);
				}
				else if (color == DyeColor.MAGENTA) {
					gpio.Output(3, true);
				}
				else if (color == DyeColor.LIGHT_BLUE) {
					gpio.Output(4, true);
				}
				else if (color == DyeColor.YELLOW) {
					gpio.Output(5, true);
				}
				else if (color == DyeColor.LIME) {
					gpio.Output(6, true);
				}
				else if (color == DyeColor.PINK) {
					gpio.Output(7, true);
				}
				else if (color == DyeColor.GRAY) {
					gpio.Output(8, true);
				}
				else if (color == DyeColor.SILVER) {
					gpio.Output(9, true);
				}
				else if (color == DyeColor.CYAN) {
					gpio.Output(10, true);
				}
				else if (color == DyeColor.PURPLE) {
					gpio.Output(11, true);
				}
				else if (color == DyeColor.BLUE) {
					gpio.Output(12, true);
				}
				else if (color == DyeColor.BROWN) {
					gpio.Output(13, true);
				}
				else if (color == DyeColor.GREEN) {
					gpio.Output(14, true);
				}
				else if (color == DyeColor.RED) {
					gpio.Output(15, true);
				}
				else if (color == DyeColor.BLACK) {
					gpio.Output(16, true);
				}
			}
                    
              
      }
}