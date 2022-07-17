package net.optifine.clickgui.components.settings;

import com.sun.javafx.geom.CubicCurve2D;
import net.minecraft.class_4587;
import net.optifine.clickgui.ClickGui;
import net.optifine.clickgui.SettingGUI;
import net.optifine.clickgui.window.AbstractWindow;

import java.awt.*;

public final class SliderGUI extends SettingGUI {
   // $FF: synthetic field
   private double George = 0.0D;
   // $FF: synthetic field
   private double Jacob = -1.5D;
   // $FF: synthetic field
   private NumberSetting James;
   // $FF: synthetic field
   private boolean William;
   // $FF: synthetic field
   private final CubicCurve2D Harry = new CubicCurve2D(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   // $FF: synthetic field
   private double Charlie = -1.5D;
   // $FF: synthetic field
   private boolean Mary;
   // $FF: synthetic field
   private net.optifine.config.NumberSetting Oscar;
   // $FF: synthetic field
   private double Thomas;
   // $FF: synthetic field
   private final ClickGui Jack = Global.Charlie();

   static {
      "".length();
      if (-" ".length() < (3 ^ 7)) {
         ;
      }
   }

   private static int lIIIIIlII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIIIIlIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Oliver(double mouseX, double mouseY, int mouseButton) {
      if (lIIIIIlII(mouseY, this.Harry()) < 0) {
         "".length();
         if ("".length() < "".length()) {
            return;
         }
      } else {
         switch(mouseButton) {
         case 0:
            this.Oscar();
            "".length();
            if (null != null) {
               return;
            }
            break;
         case 1:
            this.James();
         }

         "".length();
         if ("".length() == "  ".length()) {
            return;
         }
      }

   }

   private void James() {
      if (this.Oscar != null) {
         this.Oscar.Oliver(this.Oscar.James());
         "".length();
         if (" ".length() < " ".length()) {
            return;
         }
      } else {
         this.James.Oliver(this.James.Oliver());
      }

      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   private void Oliver(double x3, double x4, double y4, double y5) {
      y4 += 2.0D;
      y5 += 2.0D;
      double xl1 = x3;
      double xl2 = x4;
      double diff = x4 - x3;
      double percentage;
      if (this.Oscar != null) {
         percentage = (this.Oscar.Jack() - this.Oscar.Mary()) / (this.Oscar.Patricia() - this.Oscar.Mary());
         "".length();
         if ("  ".length() == 0) {
            return;
         }
      } else {
         percentage = (this.James.Oliver() - this.James.Harry()) / (this.James.Jacob() - this.James.Harry());
      }

      if (this.Oscar != null && this.Oscar.Elizabeth()) {
         double ratio = (x4 - x3) / this.Oscar.Jennifer();
         xl1 = x3 + ratio * (this.Oscar.Linda() - this.Oscar.Mary());
         xl2 = x4 + ratio * (this.Oscar.Barbara() - this.Oscar.Patricia());
      }

      Color hovered = ThemeHelper.getColor2();
      byte var10000;
      if (this.Mary) {
         var10000 = 10;
         "".length();
         if (-"   ".length() > 0) {
            return;
         }
      } else {
         var10000 = 0;
      }

      int onHover = var10000;
      RenderUtils.drawRoundedRectWithShadow((double)((float)xl1), y4, (double)((float)xl2), y5, 2.0D, (new Color(MathUtils.clamp(0, hovered.getRed() + onHover, 255), MathUtils.clamp(0, hovered.getGreen() + onHover, 255), MathUtils.clamp(0, hovered.getBlue() + onHover, 255))).getRGB(), 1.0D, 1.0D, 0.0D, (new Color(MathUtils.clamp(0, hovered.getRed() - 15, 255), MathUtils.clamp(0, hovered.getGreen() - 15, 255), MathUtils.clamp(0, hovered.getBlue() - 15, 255))).getRGB());
      Color rgb = ThemeManager.getPrimaryColor(y4 * 3.0D);
      if (Global.Thomas.Jack.Harry) {
         percentage = 0.1D + (y4 * 42781.0D + (double)(System.currentTimeMillis() * 3L)) % 5000.0D * 2.0D / 10000.0D * 0.8D;
      }

      double targetPos = xl1 + diff * percentage;
      double pos = this.Thomas + (targetPos - this.Thomas) * Math.pow((double)Global.Oliver.method_1534() / 20.0D, 0.5D);
      boolean var26;
      if (lIIIIlIII(pos - (xl1 + diff * 0.02D), 2.0D) >= 0) {
         var26 = true;
         "".length();
         if (-" ".length() > " ".length()) {
            return;
         }
      } else {
         var26 = false;
      }

      boolean render = var26;
      double var10001 = this.Charlie;
      double var10002;
      if (render) {
         var10002 = (double)Global.Oliver.method_1534();
         "".length();
         if (" ".length() < " ".length()) {
            return;
         }
      } else {
         var10002 = (double)(-Global.Oliver.method_1534());
      }

      this.Charlie = var10001 + var10002;
      this.Charlie = MathUtils.clamp(-1.5D, this.Charlie, 1.5D);
      this.Thomas = pos;
      if (render) {
         RenderUtils.drawRoundedRectWithShadow(xl1, y4, pos, y5, 2.0D, (new Color(MathUtils.clamp(0, rgb.getRed() + onHover, 255), MathUtils.clamp(0, rgb.getGreen() + onHover, 255), MathUtils.clamp(0, rgb.getBlue() + onHover, 255))).getRGB(), 0.0D, 0.0D, 5.0D, (new Color(MathUtils.clamp(0, rgb.getRed() + onHover, 255), MathUtils.clamp(0, rgb.getGreen() + onHover, 255), MathUtils.clamp(0, rgb.getBlue() + onHover, 255), (int)(255.0F / (ThemeHelper.getShadowFactor() * 3.0F)))).getRGB());
         "".length();
         if ((238 ^ 171 ^ 79 ^ 14) != (20 ^ 71 ^ 68 ^ 19)) {
            return;
         }
      } else {
         int alpha = (int)(this.Harry.eval((float)(this.Charlie / 3.0D + 0.5D)).y * 255.0F);
         pos = xl1 + diff * 0.03D;
         RenderUtils.drawRoundedRectWithShadow(xl1, y4, pos, y5, 2.0D, (new Color(MathUtils.clamp(0, rgb.getRed() + onHover, 255), MathUtils.clamp(0, rgb.getGreen() + onHover, 255), MathUtils.clamp(0, rgb.getBlue() + onHover, 255), MathUtils.clamp(0, alpha, 255))).getRGB(), 0.0D, 0.0D, 5.0D, (new Color(MathUtils.clamp(0, rgb.getRed() + onHover, 255), MathUtils.clamp(0, rgb.getGreen() + onHover, 255), MathUtils.clamp(0, rgb.getBlue() + onHover, 255), MathUtils.clamp(0, (int)((float)alpha / (ThemeHelper.getShadowFactor() * 3.0F)), 255))).getRGB());
      }

      if (this.William || this.Mary) {
         this.Oliver(xl1, y4);
      }

      "".length();
      if (-"   ".length() <= 0) {
         ;
      }
   }

   private void Jack(double x1, double y1) {
      TTFFontRenderer tr = Global.Harry.getGeneric();
      String name = this.Oscar.Susan();
      tr.drawStringWithShadow(name, x1 + 5.0D, y1, ThemeHelper.getFontColor().getRGB());
      "".length();
      if (-"   ".length() < 0) {
         ;
      }
   }

   private static int lIIIIIlll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public double George() {
      double var1 = 11.0D;
      "".length();
      return (204 ^ 138 ^ 69 ^ 7) < "   ".length() ? 0.0D : var1;
   }

   public double Oliver() {
      TTFFontRenderer fr = Global.Harry.getGeneric();
      double nameWitdh;
      double valueWidth;
      if (this.Oscar != null) {
         nameWitdh = (double)fr.getWidth(this.Oscar.Susan());
         valueWidth = (double)fr.getWidth(this.Oscar.William());
         "".length();
         if (null != null) {
            return 0.0D;
         }
      } else {
         nameWitdh = (double)fr.getWidth(this.James.Charlie());
         valueWidth = (double)fr.getWidth(this.James.toString());
      }

      double var5 = nameWitdh + valueWidth + 6.0D;
      "".length();
      return null != null ? 0.0D : var5;
   }

   private void Oliver(double mouseX, double x3, double x4) {
      if (!this.William) {
         "".length();
         if ("  ".length() < -" ".length()) {
            return;
         }
      } else if (!this.Jack.Harry()) {
         this.William = false;
         "".length();
         if ("".length() != 0) {
            return;
         }
      } else {
         double sliderWidth = x4 - x3;
         double mousePercentage = (mouseX - x3) / sliderWidth;
         boolean pressed = ((IKeyBinding)Global.Oliver.field_1690.field_1867).isActallyPressed();
         double value;
         double min;
         double range;
         if (this.Oscar != null) {
            min = this.Oscar.Mary();
            range = this.Oscar.Jennifer();
            value = min + range * mousePercentage;
            if (pressed) {
               value = this.Oscar.Jack() + (mouseX - this.George) * this.Oscar.Harry();
            }

            this.Oscar.Oliver(value);
            "".length();
            if ("".length() != 0) {
               return;
            }
         } else {
            min = this.James.Harry();
            range = this.James.Jacob() - this.James.Harry();
            value = min + range * mousePercentage;
            if (pressed) {
               value = this.James.Oliver() + (mouseX - this.George) * this.James.Jack();
            }

            this.James.Oliver(value);
         }

         "".length();
         if (" ".length() < 0) {
            return;
         }
      }

   }

   public void Oliver(class_4587 matrixStack, double mouseX, double mouseY, float partialTicks) {
      double x1 = this.Jack();
      double x2 = x1 + this.Jacob();
      double x3 = x2 - this.Jacob() / 3.0D;
      double x4 = x2 - 4.0D;
      double y1 = this.Harry();
      double y2 = y1 + this.Charlie();
      this.Oliver(mouseX, x3, x4);
      boolean var10001;
      if (this.Oliver(mouseX, mouseY, x3, x4, y1, y2) && !this.Jack.Jacob) {
         var10001 = true;
         "".length();
         if (-"   ".length() > 0) {
            return;
         }
      } else {
         var10001 = false;
      }

      this.Mary = var10001;
      if (this.Mary && lIIIIIlIl(mouseY, this.Harry()) > 0) {
         this.William();
      }

      double var19 = this.Jacob;
      double var10002;
      if (!this.Mary && !this.William) {
         var10002 = (double)(-Global.Oliver.method_1534());
      } else {
         var10002 = (double)Global.Oliver.method_1534();
         "".length();
         if ("".length() <= -" ".length()) {
            return;
         }
      }

      this.Jacob = var19 + var10002;
      this.Jacob = MathUtils.clamp(-1.5D, this.Jacob, 1.5D);
      this.Oliver(x3, x4, y1 + 3.0D, y2 - 4.0D);
      this.Jack(x1, y1);
      this.George = mouseX;
      "".length();
      if ("  ".length() != 0) {
         ;
      }
   }

   private void Oliver(double mouseX, double mouseY) {
      String value;
      if (this.Oscar != null) {
         value = this.Oscar.William();
         "".length();
         if (null != null) {
            return;
         }
      } else {
         value = this.James.toString();
      }

      int alpha = (int)(this.Harry.eval((float)(this.Jacob / 3.0D + 0.5D)).y * 255.0F);
      Color rgb = new Color(11184810);
      if (Global.Thomas.Jack.Harry) {
         value = "hidden";
      }

      Global.Harry.getSmallMain().drawStringWithShadow(value, mouseX - (double)Global.Harry.getSmallMain().getWidth(value) - 3.0D, mouseY - 3.0D, (new Color(MathUtils.clamp(0, rgb.getRed(), 255), MathUtils.clamp(0, rgb.getGreen(), 255), MathUtils.clamp(0, rgb.getBlue(), 255), MathUtils.clamp(0, alpha, 255))).getRGB());
      "".length();
      if (" ".length() >= 0) {
         ;
      }
   }

   public SliderGUI( net.optifine.config.NumberSetting setting) {
      this.Oscar = setting;
      this.Oliver = setting;
      this.Harry(this.Oliver());
      this.Jacob(this.George());
      "".length();
      if (" ".length() <= 0) {
         throw null;
      }
   }

   private boolean Oliver(double mouseX, double mouseY, double x1, double x2, double y1, double y2) {
      AbstractWindow parent = this.Thomas();
      boolean scrollEnabled = parent.Elizabeth();
      double var10000;
      if (scrollEnabled) {
         var10000 = parent.Patricia();
         "".length();
         if (" ".length() != " ".length()) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0.0D;
      }

      double scroll = var10000;
      byte var17;
      if (lIIIIIllI(mouseX, x1) >= 0 && lIIIIIllI(mouseY, y1) >= 0 && lIIIIIlll(mouseX, x2) < 0 && lIIIIIlll(mouseY, y2) < 0 && lIIIIIllI(mouseY, -scroll) >= 0 && lIIIIIlll(mouseY, parent.Charlie() - 25.0D - scroll) < 0) {
         var17 = 1;
         "".length();
         if ((163 + 119 - 211 + 117 ^ 16 + 15 - -3 + 150) < 0) {
            return (boolean)"".length();
         }
      } else {
         var17 = 0;
      }

      byte var16 = var17;
      "".length();
      return (boolean)(" ".length() < "".length() ? "".length() : var16);
   }

   private void Oscar() {
      this.William = true;
      "".length();
      if (" ".length() != 0) {
         ;
      }
   }

   private static int lIIIIIlIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIIIIIllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private void William() {
      if (!this.William) {
         if (this.Oscar != null) {
            this.Jack.Oliver(this.Oscar.Oliver());
            "".length();
            if ("  ".length() > "  ".length()) {
               return;
            }
         } else {
            this.Jack.Oliver(this.James.Thomas());
         }
      }

      "".length();
      if (-(64 ^ 69) < 0) {
         ;
      }
   }
}
