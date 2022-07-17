package net.optifine.features.module.combat;

import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.util.gui.Translatable;
import net.minecraft.class_1309;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class DoubleTap extends Module {
   // $FF: synthetic field
   BooleanSetting Jack = new BooleanSetting("Should Crit", true);
   // $FF: synthetic field
   NumberSetting Harry = new NumberSetting("Cooldown", 0.4D, 0.0D, 1.0D, 0.01D);
   // $FF: synthetic field
   NumberSetting Jacob;

   private static int lIlIlIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIlIlIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public DoubleTap() {
      super("DoubleTap", Translatable.DOUBLETAP, Category.Oliver);
      this.Jacob = new NumberSetting("Health", Translatable.DOUBLETAP_V_HP, 5.0D, 0.0D, 20.0D, 0.1D);
      this.addSetting(this.Jack);
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      "".length();
      if (null != null) {
         throw null;
      }
   }

   private static int lIlIlIll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public boolean Oliver(class_1309 entity) {
      boolean var6;
      if (entity == null) {
         var6 = false;
         "".length();
         if ("   ".length() <= "  ".length()) {
            return (boolean)"".length();
         }
      } else if (this.isEnabled()) {
         if (mc.field_1724 == null) {
            var6 = false;
            "".length();
            if ("".length() != 0) {
               return (boolean)"".length();
            }
         } else {
            boolean var10000;
            if (this.Jack.Jack() && !Global.Jack().Linda.isEnabled() && lIlIlIII((double)mc.field_1724.field_6017, 0.08D) < 0 && (!mc.field_1724.method_6128() || lIlIlIIl(mc.field_1724.method_18798().method_10214(), 0.0D) >= 0)) {
               var10000 = false;
            } else {
               var10000 = true;
               "".length();
               if ("".length() != 0) {
                  return (boolean)"".length();
               }
            }

            boolean critState = var10000;
            if (lIlIlIlI(mc.field_1724.method_7261(0.0F), this.Harry.George()) >= 0) {
               var10000 = true;
               "".length();
               if (-" ".length() >= "".length()) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = false;
            }

            boolean cooldownState = var10000;
            if (lIlIlIll(entity.method_6032(), this.Jacob.George()) <= 0) {
               var10000 = true;
               "".length();
               if (" ".length() > "  ".length()) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = false;
            }

            boolean healthState = var10000;
            if (Global.Jack().JacoB.James().Harry() == Killaura.PvpVersion.Jack) {
               var10000 = true;
               "".length();
               if ("".length() > " ".length()) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = false;
            }

            boolean version = var10000;
            if (critState && cooldownState && healthState && version) {
               var10000 = true;
               "".length();
               if ("".length() == -" ".length()) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = false;
            }

            var6 = var10000;
            "".length();
            if ((13 ^ 9) < "  ".length()) {
               return (boolean)"".length();
            }
         }
      } else {
         var6 = false;
         "".length();
         if (null != null) {
            return (boolean)"".length();
         }
      }

      return var6;
   }

   private static int lIlIlIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   static {
      "".length();
      if (-"  ".length() < 0) {
         ;
      }
   }
}
