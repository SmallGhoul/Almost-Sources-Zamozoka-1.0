package net.optifine.features.module.util;

import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public final class Timer extends Module implements UpdateListener {
   // $FF: synthetic field
   private final NumberSetting Jacob;
   // $FF: synthetic field
   private final NumberSetting Charlie;
   // $FF: synthetic field
   public static float Jack = 1.0F;
   // $FF: synthetic field
   int Harry;

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if (null == null) {
         ;
      }
   }

   private static int lIlIllIIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   static {
      "".length();
      if ("".length() <= 0) {
         ;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      this.Harry = this.Charlie.Oscar();
      "".length();
      if (null == null) {
         ;
      }
   }

   public void Thomas() {
      --this.Harry;
      if (this.Charlie.Oscar() > 1 && this.Harry <= 0) {
         this.Oliver(false);
      }

      "".length();
      if ("   ".length() >= 0) {
         ;
      }
   }

   public String Oliver() {
      String var1 = this.Jacob.William();
      "".length();
      return -(178 ^ 182) >= 0 ? null : var1;
   }

   public Timer() {
      super("Timer", "Changes the speed of almost everything.");
      this.Jacob = new NumberSetting("Speed", 2.0D, 0.1D, 20.0D, 0.01D, ValueDisplay.Oliver);
      this.Charlie = new NumberSetting("Limit", 10.0D, 1.0D, 200.0D, 1.0D, (v) -> {
         String var10000;
         if (lIlIllIIIl(v, 1.0D) == 0) {
            var10000 = "disabled";
            "".length();
            if ("".length() != 0) {
               return null;
            }
         } else {
            var10000 = String.valueOf((new StringBuilder()).append((int)v).append(""));
         }

         String var2 = var10000;
         "".length();
         return "  ".length() < 0 ? null : var2;
      });
      this.Harry = 0;
      this.Oliver(Category.Charlie);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      "".length();
      if (null != null) {
         throw null;
      }
   }

   public float George() {
      float var10000;
      if (this.isEnabled()) {
         var10000 = this.Jacob.George();
         "".length();
         if ("   ".length() == (52 + 46 - 78 + 159 ^ 5 + 135 - 85 + 128)) {
            return 0.0F;
         }
      } else {
         var10000 = 1.0F;
      }

      float var1 = var10000 * Jack;
      "".length();
      return (82 + 164 - 158 + 78 ^ 13 + 26 - -83 + 40) == "".length() ? 0.0F : var1;
   }
}
