package net.optifine.features.module.render;

import net.optifine.config.EnumSetting;
import net.optifine.managers.event.event.EventManager;
import net.optifine.managers.event.events.UpdateListener;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_3532;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public final class Fullbright extends Module implements UpdateListener {
   // $FF: synthetic field
   private double Charlie;
   // $FF: synthetic field
   private float Jacob;
   // $FF: synthetic field
   private boolean Harry;
   // $FF: synthetic field
   private final EnumSetting< Method> Jack;

   private void Jennifer() {
      this.Harry = true;
      class_315 options = mc.field_1690;
      if (lIlllIlIIl(Math.abs(options.field_1840 - 12.0D), 0.5D) <= 0) {
         options.field_1840 = 12.0D;
         "".length();
         if (-" ".length() != -" ".length()) {
            return;
         }
      } else {
         if (lIlllIlIIl(options.field_1840, 12.0D) < 0) {
            options.field_1840 += 0.5D;
            "".length();
            if ("".length() != 0) {
               return;
            }
         } else {
            options.field_1840 -= 0.5D;
         }

         "".length();
         if (-" ".length() >= "".length()) {
            return;
         }
      }

   }

   // $FF: synthetic method
   static EventManager William() {
      EventManager var0 = EVENT_MANAGER;
      "".length();
      return null != null ? null : var0;
   }

   public boolean George() {
      byte var10000;
      if (lIlllIlIll(this.Jacob, 0.0F) > 0) {
         var10000 = 1;
         "".length();
         if ("  ".length() <= 0) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var1 = var10000;
      "".length();
      return (boolean)("".length() != 0 ? "".length() : var1);
   }

   // $FF: synthetic method
   static boolean Oliver(Fullbright x0, boolean x1) {
      byte var2 = x0.Harry = (boolean)x1;
      "".length();
      return (boolean)("".length() != 0 ? "".length() : var2);
   }

   private void Patricia() {
      if (this.isEnabled()) {
         this.Jennifer();
         "".length();
         if ("".length() > " ".length()) {
            return;
         }
      } else {
         if (this.Harry) {
            this.Oliver(this.Charlie);
         }

         "".length();
         if ((90 ^ 94) < "   ".length()) {
            return;
         }
      }

   }

   private void Mary() {
      EVENT_MANAGER.Oliver(UpdateListener.class, new UpdateListener() {
         private static int llIlIlII(double var0, double var2) {
            double var4;
            return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
         }

         {
            "".length();
            if ("".length() > 0) {
               throw null;
            }
         }

         public void Thomas() {
            double gamma = Fullbright.James().field_1690.field_1840;
            if (llIlIlII(gamma, 1.0D) > 0) {
               Fullbright.Oliver(Fullbright.this, true);
               "".length();
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               Fullbright.Oliver(Fullbright.this, gamma);
            }

            Fullbright.William().Jack(UpdateListener.class, this);
            "".length();
            if ((137 ^ 141) != 0) {
               ;
            }
         }

         static {
            "".length();
            if (-" ".length() <= 0) {
               ;
            }
         }
      });
      "".length();
      if (null == null) {
         ;
      }
   }

   // $FF: synthetic method
   static class_310 James() {
      class_310 var0 = mc;
      "".length();
      return " ".length() != " ".length() ? null : var0;
   }

   public Fullbright() {
      super("Fullbright", "Sets your minecraft brightness to maximum value", Category.Harry);
      this.Jack = new EnumSetting("Method", Method.values(), Method.Oliver);
      this.addSetting(this.Jack);
      this.Mary();
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if (-"   ".length() > 0) {
         throw null;
      }
   }

   public void Thomas() {
      this.Patricia();
      this.Elizabeth();
      "".length();
      if ("   ".length() != 0) {
         ;
      }
   }

   public float Oscar() {
      float var1 = this.Jacob;
      "".length();
      return "  ".length() > "   ".length() ? 0.0F : var1;
   }

   private static int lIlllIlIll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static int lIlllIlIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   // $FF: synthetic method
   static double Oliver(Fullbright x0, double x1) {
      double var3 = x0.Charlie = x1;
      "".length();
      return "".length() != 0 ? 0.0D : var3;
   }

   private void Elizabeth() {
      boolean var10000;
      if (this.isEnabled() && this.Jack.Harry() == Method.Jack) {
         var10000 = true;
         "".length();
         if ("".length() != 0) {
            return;
         }
      } else {
         var10000 = false;
      }

      boolean shouldGiveNightVision = var10000;
      if (shouldGiveNightVision) {
         this.Jacob = (float)((double)this.Jacob + 0.03125D);
         "".length();
         if ((134 ^ 146 ^ 94 ^ 78) < 0) {
            return;
         }
      } else {
         this.Jacob = (float)((double)this.Jacob - 0.03125D);
      }

      this.Jacob = class_3532.method_15363(this.Jacob, 0.0F, 1.0F);
      "".length();
      if ("   ".length() > " ".length()) {
         ;
      }
   }

   private void Oliver(double target) {
      class_315 options = mc.field_1690;
      if (lIlllIlIlI(Math.abs(options.field_1840 - target), 0.5D) <= 0) {
         options.field_1840 = target;
         this.Harry = false;
         "".length();
         if ("   ".length() > (32 + 122 - 56 + 41 ^ 110 + 75 - 45 + 3)) {
            return;
         }
      } else {
         if (lIlllIlIlI(options.field_1840, target) < 0) {
            options.field_1840 += 0.5D;
            "".length();
            if (-" ".length() >= " ".length()) {
               return;
            }
         } else {
            options.field_1840 -= 0.5D;
         }

         "".length();
         if ("  ".length() == -" ".length()) {
            return;
         }
      }

   }

   private static int lIlllIlIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   static {
      "".length();
      if (null == null) {
         ;
      }
   }

   private static enum Method {
      // $FF: synthetic field
      private final String Harry;
      // $FF: synthetic field
      Oliver("Gamma"),
      // $FF: synthetic field
      Jack("Night Vision");

      static {
         "".length();
         if (null == null) {
            ;
         }
      }

      public String toString() {
         String var1 = this.Harry;
         "".length();
         return null != null ? null : var1;
      }

      private Method(String name) {
         this.Harry = name;
         "".length();
         if (null != null) {
            throw null;
         }
      }
   }
}
