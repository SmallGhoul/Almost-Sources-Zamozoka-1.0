package net.optifine.features.module.world;

import net.optifine.config.BooleanSetting;
import net.optifine.managers.event.events.BlockBreakingProgressListener;
import net.optifine.managers.event.events.BlockBreakingProgressListener.BlockBreakingProgressEvent;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.BlockUtils;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public final class AutoTool extends Module implements BlockBreakingProgressListener, UpdateListener {
   // $FF: synthetic field
   private final BooleanSetting Charlie = new BooleanSetting("Switch back", "", true);
   // $FF: synthetic field
   private final BooleanSetting Jack = new BooleanSetting("Sword", "", false);
   // $FF: synthetic field
   private int Thomas;
   // $FF: synthetic field
   private final BooleanSetting Jacob = new BooleanSetting("Don't break", "", false);
   // $FF: synthetic field
   private final BooleanSetting Harry = new BooleanSetting("Hand", "", true);

   public void Charlie() {
      EVENT_MANAGER.Jack(BlockBreakingProgressListener.class, this);
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if ("   ".length() == "   ".length()) {
         ;
      }
   }

   private int Oscar() {
      class_1661 inventory = mc.field_1724.field_7514;
      int slot = 0;

      int var4;
      while(true) {
         if (slot >= 9) {
            var4 = -1;
            "".length();
            if ("  ".length() < "".length()) {
               return "".length();
            }
            break;
         }

         if (slot == inventory.field_7545) {
            "".length();
            if (" ".length() >= "  ".length()) {
               return "".length();
            }
         } else {
            class_1799 stack = inventory.method_5438(slot);
            if (!this.Oliver(stack)) {
               var4 = slot;
               "".length();
               if (null != null) {
                  return "".length();
               }
               break;
            }
         }

         ++slot;
         "".length();
         if (-" ".length() > (26 ^ 19 ^ 114 ^ 127)) {
            return "".length();
         }
      }

      return var4;
   }

   static {
      "".length();
      if (-" ".length() != "".length()) {
         ;
      }
   }

   public void Oliver(class_2338 pos) {
      class_746 player = mc.field_1724;
      if (player.field_7503.field_7477) {
         "".length();
         if ("".length() > (13 ^ 54 ^ 41 ^ 22)) {
            return;
         }
      } else {
         boolean useSwords = this.Jacob.Jack();
         boolean useHands = this.Harry.Jack();
         boolean repairMode = this.Jacob.Jack();
         int bestSlot = this.Oliver(pos, useSwords, repairMode);
         if (bestSlot == -1) {
            class_1799 heldItem = player.method_6047();
            if (!this.Oliver(heldItem)) {
               "".length();
               if (-" ".length() < -" ".length()) {
                  return;
               }
            } else if (repairMode && this.Jack(heldItem)) {
               this.George();
               "".length();
               if (-" ".length() > 0) {
                  return;
               }
            } else if (useHands && this.Oliver(heldItem, pos)) {
               this.George();
               "".length();
               if (-" ".length() < -" ".length()) {
                  return;
               }
            } else {
               "".length();
               if ("".length() != 0) {
                  return;
               }
            }
         } else {
            player.field_7514.field_7545 = bestSlot;
            "".length();
            if ("   ".length() < 0) {
               return;
            }
         }
      }

   }

   private void George() {
      int fallbackSlot = this.Oscar();
      class_1661 inventory = mc.field_1724.field_7514;
      if (fallbackSlot == -1) {
         if (inventory.field_7545 == 8) {
            inventory.field_7545 = 0;
            "".length();
            if (" ".length() >= "   ".length()) {
               return;
            }
         } else {
            ++inventory.field_7545;
         }

         "".length();
         if ("  ".length() >= (182 ^ 178)) {
            return;
         }
      } else {
         inventory.field_7545 = fallbackSlot;
         "".length();
         if (null != null) {
            return;
         }
      }

   }

   public void Oliver(BlockBreakingProgressEvent event) {
      class_2338 pos = event.Oliver();
      if (!BlockUtils.canBeClicked(pos)) {
         "".length();
         if ("  ".length() < 0) {
            return;
         }
      } else {
         if (this.Thomas == -1) {
            this.Thomas = mc.field_1724.field_7514.field_7545;
         }

         this.Oliver(pos);
         "".length();
         if ((31 ^ 27) <= " ".length()) {
            return;
         }
      }

   }

   private float Oliver(class_1799 stack, class_2680 state) {
      float speed = stack.method_7924(state);
      if (llIllIIIlI(speed, 1.0F) > 0) {
         int efficiency = class_1890.method_8225(class_1893.field_9131, stack);
         if (efficiency > 0 && !stack.method_7960()) {
            speed += (float)(efficiency * efficiency + 1);
         }
      }

      "".length();
      return "".length() != 0 ? 0.0F : speed;
   }

   private boolean Jack(class_1799 stack) {
      byte var10000;
      if (stack.method_7936() - stack.method_7919() <= 4) {
         var10000 = 1;
         "".length();
         if ("  ".length() > "  ".length()) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var2 = var10000;
      "".length();
      return (boolean)("   ".length() == 0 ? "".length() : var2);
   }

   private static int llIllIIIll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public AutoTool() {
      super("AutoTool", "Cheat-Client will use needed tools for some types of blocks.");
      this.Oliver((Category)Category.Jacob);
      this.addSetting(this.Jack);
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      "".length();
      if (null != null) {
         throw null;
      }
   }

   private static int llIllIIIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static int llIllIIIIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private boolean Oliver(class_1799 stack) {
      byte var10000;
      if (!stack.method_7960() && stack.method_7909().method_7846()) {
         var10000 = 1;
         "".length();
         if ((122 ^ 127) == 0) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var2 = var10000;
      "".length();
      return (boolean)("".length() != "".length() ? "".length() : var2);
   }

   public void Thomas() {
      if (this.Thomas != -1 && !mc.field_1761.method_2923()) {
         if (this.Charlie.Jack()) {
            mc.field_1724.field_7514.field_7545 = this.Thomas;
         }

         this.Thomas = -1;
         "".length();
         if ((111 ^ 91 ^ 176 ^ 128) == "  ".length()) {
            return;
         }
      } else {
         "".length();
         if ("  ".length() < 0) {
            return;
         }
      }

   }

   private int Oliver(class_2338 pos, boolean useSwords, boolean repairMode) {
      class_746 player = mc.field_1724;
      class_1661 inventory = player.field_7514;
      class_1799 heldItem = mc.field_1724.method_6047();
      class_2680 state = BlockUtils.getState(pos);
      float bestSpeed = this.Oliver(heldItem, state);
      int bestSlot = -1;
      int slot = 0;

      do {
         if (slot >= 9) {
            "".length();
            if ("".length() > 0) {
               return "".length();
            }

            return bestSlot;
         }

         if (slot == inventory.field_7545) {
            "".length();
            if (" ".length() <= "".length()) {
               return "".length();
            }
         } else {
            class_1799 stack = inventory.method_5438(slot);
            float speed = this.Oliver(stack, state);
            if (llIllIIIIl(speed, bestSpeed) <= 0) {
               "".length();
               if (-" ".length() >= (139 ^ 182 ^ 80 ^ 105)) {
                  return "".length();
               }
            } else if (!useSwords && stack.method_7909() instanceof class_1829) {
               "".length();
               if (null != null) {
                  return "".length();
               }
            } else if (repairMode && this.Jack(stack)) {
               "".length();
               if (-(225 ^ 178 ^ 5 ^ 83) >= 0) {
                  return "".length();
               }
            } else {
               bestSpeed = speed;
               bestSlot = slot;
            }
         }

         ++slot;
         "".length();
      } while("".length() == 0);

      return "".length();
   }

   private boolean Oliver(class_1799 heldItem, class_2338 pos) {
      class_2680 state = BlockUtils.getState(pos);
      byte var10000;
      if (llIllIIIll(this.Oliver(heldItem, state), 1.0F) <= 0) {
         var10000 = 1;
         "".length();
         if (-"   ".length() >= 0) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var4 = var10000;
      "".length();
      return (boolean)("".length() == (154 ^ 149 ^ 8 ^ 3) ? "".length() : var4);
   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(BlockBreakingProgressListener.class, this);
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      this.Thomas = -1;
      "".length();
      if ("".length() == 0) {
         ;
      }
   }
}
