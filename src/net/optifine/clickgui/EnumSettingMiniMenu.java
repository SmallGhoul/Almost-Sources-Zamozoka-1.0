package net.optifine.clickgui;

import com.sun.javafx.geom.CubicCurve2D;
import net.minecraft.class_4587;

public final class EnumSettingMiniMenu<T extends Enum<T>> extends MiniMenu {
   // $FF: synthetic field
   private ListSetting Charlie;
   // $FF: synthetic field
   private final float Harry;
   // $FF: synthetic field
   private final CubicCurve2D Jack = new CubicCurve2D(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   // $FF: synthetic field
   public double Oliver = 0.0D;
   // $FF: synthetic field
   private EnumSetting<T> Jacob;

   static {
      "".length();
      if ("".length() >= 0) {
         ;
      }
   }

   private float Mary() {
      float w = 0.0F;
      Enum[] var2 = this.Jacob.Jack();
      int var3 = var2.length;
      int var4 = 0;

      do {
         if (var4 >= var3) {
            float var6 = w + 7.0F;
            "".length();
            if ("".length() != 0) {
               return 0.0F;
            }

            return var6;
         }

         Enum<T> v = var2[var4];
         w = Math.max(w, Global.Harry.getSmallMain().getWidth(v.toString()));
         ++var4;
         "".length();
      } while("  ".length() != 0);

      return 0.0F;
   }

   private static int lIIIllIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Oliver(int mouseX, int mouseY, int mouseButton) {
      if (mouseButton != 0) {
         "".length();
         if ((14 ^ 0 ^ 46 ^ 36) == -" ".length()) {
            return;
         }
      } else {
         double y = this.Charlie();
         int var7;
         int var8;
         double y2;
         if (this.Jacob == null) {
            String[] var12 = this.Charlie.Oliver();
            var7 = var12.length;
            var8 = 0;

            while(var8 < var7) {
               String value = var12[var8];
               if (Integer.valueOf(this.Charlie.Jack().hashCode()).equals(value.hashCode())) {
                  "".length();
                  if (-" ".length() >= 0) {
                     return;
                  }
               } else {
                  y2 = y + (double)Global.Harry.getSmallMain().getHeight(value);
                  if (lIIIllIl((double)mouseY, y) >= 0 && lIIIlllI((double)mouseY, y2) <= 0) {
                     this.Jacob.Oliver(value);
                     "".length();
                     this.James();
                     "".length();
                     if ((130 + 94 - 150 + 105 ^ 103 + 62 - 80 + 97) <= 0) {
                        return;
                     }
                     break;
                  }

                  y = y2;
               }

               ++var8;
               "".length();
               if ("  ".length() >= "   ".length()) {
                  return;
               }
            }
         } else {
            Enum[] var6 = this.Jacob.Jack();
            var7 = var6.length;
            var8 = 0;

            while(var8 < var7) {
               T val = var6[var8];
               if (val == this.Jacob.Harry()) {
                  "".length();
                  if ("  ".length() == 0) {
                     return;
                  }
               } else {
                  y2 = y + (double)Global.Harry.getSmallMain().getHeight(val.toString());
                  if (lIIIllIl((double)mouseY, y) >= 0 && lIIIlllI((double)mouseY, y2) <= 0) {
                     this.Jacob.Oliver(val);
                     this.James();
                     "".length();
                     if (-" ".length() >= 0) {
                        return;
                     }
                     break;
                  }

                  y = y2;
               }

               ++var8;
               "".length();
               if ("".length() != 0) {
                  return;
               }
            }

            "".length();
            if ("".length() >= "  ".length()) {
               return;
            }
         }

         "".length();
         if ("   ".length() < 0) {
            return;
         }
      }

   }

   public EnumSettingMiniMenu( PartOfGUI owner, EnumSetting<T> setting) {
      super(owner);
      this.Jacob = setting;
      this.Harry = this.Mary();
      this.Harry(this.Oliver());
      this.Jacob(this.Jack());
      "".length();
      if ("  ".length() != "  ".length()) {
         throw null;
      }
   }

   public double Oliver() {
      double var1 = (double)this.Harry;
      "".length();
      return -(57 ^ 61) > 0 ? 0.0D : var1;
   }

   private static int lIIIllll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIIIlllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public double Jack() {
      double h = 0.0D;
      int i = 0;

      do {
         if (i >= this.Jacob.Jack().length) {
            "".length();
            if (null != null) {
               return 0.0D;
            }

            return h;
         }

         if (this.Jacob.Jack()[i] == this.Jacob.Harry()) {
            "".length();
            if ("   ".length() < -" ".length()) {
               return 0.0D;
            }
         } else {
            h += (double)Global.Harry.getSmallMain().getHeight(this.Jacob.Jack()[i].toString());
         }

         ++i;
         "".length();
      } while("   ".length() >= "".length());

      return 0.0D;
   }

   public void Oliver(class_4587 matrixStack, double mouseX, double mouseY) {
      this.Jacob(this.Jack());
      this.Oliver(this.Harry().Jacob() - this.Thomas());
      this.Jack(this.Harry().Charlie() + 3.0D);
      if (this.Oscar()) {
         this.Oliver -= (double)(Global.Oliver.method_1534() / 5.0F);
         if (lIIIllll(this.Oliver, 0.0D) <= 0) {
            this.Oliver(false);
            "".length();
            if ((17 ^ 103 ^ 16 ^ 98) != (90 ^ 43 ^ 86 ^ 35)) {
               return;
            }
         }
      } else {
         this.Oliver += (double)(Global.Oliver.method_1534() / 5.0F);
      }

      this.Oliver = MathUtils.clamp(0.0D, this.Oliver, 1.0D);
      double h = this.George() * (double)this.Jack.eval((float)this.Oliver).y;
      double y = Math.min(this.Charlie(), -this.Charlie() + this.Harry().Thomas().Charlie() - h - this.Harry().Harry() - this.Harry().Thomas().Patricia() - 14.0D);
      double x2 = this.Jacob() + this.Thomas() - 5.0D;
      double x1 = x2 - (double)this.Harry;
      double radius = 2.0D;
      if (lIIIllll(h, radius) < 0) {
         radius = h / 2.0D;
      }

      RenderUtils.drawRoundedRectWithShadow(x1 + 1.0D, y + 1.0D, x2 + 1.0D, y + h + 1.0D, radius, ThemeHelper.getColor().getRGB(), 0.0D, 0.0D, 30.0D, ThemeHelper.getColor().getRGB());
      RenderUtils.drawRoundedRect(x1, y, x2, y + h, radius, ThemeHelper.getColor2().getRGB());
      int i = 0;
      int c = this.Jacob.Jack().length - 1;
      Enum[] var18 = this.Jacob.Jack();
      int var19 = var18.length;
      int var20 = 0;

      do {
         if (var20 >= var19) {
            "".length();
            if ((186 ^ 190) != (77 ^ 73)) {
               return;
            }

            return;
         }

         T val = var18[var20];
         if (val == this.Jacob.Harry()) {
            "".length();
            if (null != null) {
               return;
            }
         } else {
            Global.Harry.getSmallMain().drawString(val.toString(), x1, y + (double)i * h / (double)c, ThemeHelper.getFontColor().getRGB() & ((int)(this.Oliver * 255.0D) << 24 | 16777215));
            "".length();
            ++i;
         }

         ++var20;
         "".length();
      } while(-" ".length() < 0);

   }
}
