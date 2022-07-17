package net.optifine.features.module.world;

import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.BlockBreakingProgressListener;
import net.optifine.managers.event.events.BlockBreakingProgressListener.BlockBreakingProgressEvent;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.mixinterface.IClientPlayerInteractionManager;
import net.minecraft.class_1268;
import net.minecraft.class_2846.class_2847;
import net.minecraft.class_2879;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public final class FastBreak extends Module implements UpdateListener, BlockBreakingProgressListener {
   // $FF: synthetic field
   private final NumberSetting Harry;
   // $FF: synthetic field
   private final NumberSetting Jacob;
   // $FF: synthetic field
   private final BooleanSetting Jack = new BooleanSetting("No Delay", true);

   public void Oliver(BlockBreakingProgressEvent event) {
      IClientPlayerInteractionManager im = IMC.getInteractionManager();
      if (lIIIllllIll((double)im.getCurrentBreakingProgress(), this.Harry.Jack()) <= 0) {
         "".length();
         if ((133 ^ 129) < 0) {
            return;
         }
      } else {
         int i = 0;

         while(i < this.Jacob.Oscar()) {
            mc.field_1724.field_3944.method_2883(new class_2879(class_1268.field_5808));
            ++i;
            "".length();
            if ("  ".length() >= (131 ^ 135)) {
               return;
            }
         }

         im.sendPlayerActionC2SPacket(class_2847.field_12973, event.Oliver(), event.Jack());
         mc.field_1687.method_22352(event.Oliver(), false);
         "".length();
         "".length();
         if ("  ".length() <= " ".length()) {
            return;
         }
      }

   }

   public String Oliver() {
      String var1;
      if (lIIIllllIlI(this.Harry.Jack(), 1.0D) == 0) {
         String var10000;
         if (this.Jack.Jack()) {
            var10000 = "No Delay";
            "".length();
            if ("".length() == "   ".length()) {
               return null;
            }
         } else {
            var10000 = "";
         }

         var1 = var10000;
         "".length();
         if (null != null) {
            return null;
         }
      } else {
         var1 = String.valueOf((new StringBuilder()).append(Math.round(this.Harry.Jack() * 100.0D)).append("%"));
         "".length();
         if ("   ".length() == 0) {
            return null;
         }
      }

      return var1;
   }

   public FastBreak() {
      super("FastBreak", "Allows you to break blocks faster", Category.Jacob);
      this.Harry = new NumberSetting("Break Percentage", 0.8D, 0.01D, 1.0D, 0.01D, ValueDisplay.Harry);
      this.Jacob = new NumberSetting("Additional Swings", 2.0D, 0.0D, 20.0D, 1.0D, (v) -> {
         String var10000;
         if (lIIIlllllII(v, 0.0D) == 0) {
            var10000 = "disabled";
            "".length();
            if ("   ".length() < 0) {
               return null;
            }
         } else {
            var10000 = String.valueOf((new StringBuilder()).append((int)v).append(""));
         }

         String var2 = var10000;
         "".length();
         return -(209 ^ 161 ^ 64 ^ 52) > 0 ? null : var2;
      });
      this.addSetting(this.Jack);
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      "".length();
      if (" ".length() == 0) {
         throw null;
      }
   }

   static {
      "".length();
      if (null == null) {
         ;
      }
   }

   private static int lIIIlllllII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIIIllllIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Thomas() {
      if (this.Jack.Jack()) {
         IMC.getInteractionManager().setBlockHitDelay(0);
      }

      "".length();
      if (-" ".length() != (73 ^ 77)) {
         ;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      EVENT_MANAGER.Oliver(BlockBreakingProgressListener.class, this);
      "".length();
      if ("   ".length() != 0) {
         ;
      }
   }

   private static int lIIIllllIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      EVENT_MANAGER.Jack(BlockBreakingProgressListener.class, this);
      "".length();
      if ("".length() < "  ".length()) {
         ;
      }
   }
}
