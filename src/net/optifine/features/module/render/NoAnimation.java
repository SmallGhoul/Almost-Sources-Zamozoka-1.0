package net.optifine.features.module.render;

import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.minecraft.class_1297;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class NoAnimation extends Module {
   // $FF: synthetic field
   private final NumberSetting Charlie = new NumberSetting("Limb Distance", 0.0D, -1.0D, 1.0D, 0.01D);
   // $FF: synthetic field
   private final NumberSetting Thomas = new NumberSetting("Animation Progress", 0.0D, -1.0D, 1.0D, 0.01D);
   // $FF: synthetic field
   private final BooleanSetting Harry = new BooleanSetting("Others", false);
   // $FF: synthetic field
   private final BooleanSetting Jack = new BooleanSetting("Self", true);
   // $FF: synthetic field
   private final NumberSetting Jacob = new NumberSetting("Limb Angle", 0.0D, -1.0D, 1.0D, 0.01D);

   public float Oscar() {
      float var1 = this.Thomas.George();
      "".length();
      return "  ".length() < 0 ? 0.0F : var1;
   }

   static {
      "".length();
      if (" ".length() <= (115 ^ 119)) {
         ;
      }
   }

   public NoAnimation() {
      super("NoAnimation", "Disables movement animations.", Category.Harry);
      this.addSetting(this.Jack);
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      this.addSetting(this.Thomas);
      "".length();
      if ("  ".length() < 0) {
         throw null;
      }
   }

   public boolean Oliver(class_1297 e) {
      boolean var2;
      if (!this.isEnabled()) {
         var2 = true;
         "".length();
         if (-" ".length() >= " ".length()) {
            return (boolean)"".length();
         }
      } else {
         boolean var10000;
         if (e == mc.field_1724) {
            if (!this.Jack.Jack()) {
               var10000 = true;
               "".length();
               if (" ".length() == "   ".length()) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = false;
            }

            var2 = var10000;
            "".length();
            if ("   ".length() <= "".length()) {
               return (boolean)"".length();
            }
         } else {
            if (!this.Harry.Jack()) {
               var10000 = true;
               "".length();
               if ("  ".length() != "  ".length()) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = false;
            }

            var2 = var10000;
            "".length();
            if (-" ".length() == "".length()) {
               return (boolean)"".length();
            }
         }
      }

      return var2;
   }

   public float Thomas() {
      float var1 = this.Jacob.George();
      "".length();
      return "   ".length() <= " ".length() ? 0.0F : var1;
   }

   public float George() {
      float var1 = (float)((double)this.Charlie.George() * 2.2D);
      "".length();
      return " ".length() != " ".length() ? 0.0F : var1;
   }
}
