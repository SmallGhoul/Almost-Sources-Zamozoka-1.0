package net.optifine.clickgui.components.settings;

import com.sun.javafx.geom.CubicCurve2D;
import net.minecraft.class_4587;
import net.optifine.clickgui.ClickGui;
import net.optifine.clickgui.SettingGUI;
import net.optifine.clickgui.window.AbstractWindow;
import org.lwjgl.opengl.GL11;

import java.awt.*;

public final class CheckboxGUI extends SettingGUI {
   // $FF: synthetic field
   private double Charlie = -1.5D;
   // $FF: synthetic field
   private final CubicCurve2D Harry = new CubicCurve2D(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   // $FF: synthetic field
   private double Thomas = -1.5D;
   // $FF: synthetic field
   private BooleanSetting Jacob;
   // $FF: synthetic field
   private final ClickGui Jack = Global.Charlie();

   private boolean Oliver(double mouseX, double mouseY, double x1, double x2, double y1, double y2) {
      AbstractWindow parent = this.Thomas();
      boolean scrollEnabled = parent.Elizabeth();
      double var10000;
      if (scrollEnabled) {
         var10000 = parent.Patricia();
         "".length();
         if (null != null) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0.0D;
      }

      double scroll = var10000;
      byte var17;
      if (lIIIIllIllI(mouseX, x1) >= 0 && lIIIIllIllI(mouseY, y1) >= 0 && lIIIIllIlll(mouseX, x2) < 0 && lIIIIllIlll(mouseY, y2) < 0 && lIIIIllIllI(mouseY, -scroll) >= 0 && lIIIIllIlll(mouseY, parent.Charlie() - 25.0D - scroll) < 0) {
         var17 = 1;
         "".length();
         if ((18 ^ 0 ^ 119 ^ 97) <= 0) {
            return (boolean)"".length();
         }
      } else {
         var17 = 0;
      }

      byte var16 = var17;
      "".length();
      return (boolean)("   ".length() <= 0 ? "".length() : var16);
   }

   public void Oliver(class_4587 matrixStack, double mouseX, double mouseY, float partialTicks) {
      double x1 = this.Jack() + 5.0D;
      double x4 = this.Jack() + this.Jacob() - 18.0D;
      double x2 = x1 + this.Jacob();
      double x3 = x4 + 11.0D;
      double y1 = this.Harry();
      double y2 = y1 + this.Charlie();
      boolean var10000;
      if (this.Oliver(mouseX, mouseY, x1, x2, y1, y2) && !this.Jack.Jacob) {
         var10000 = true;
         "".length();
         if ("".length() != 0) {
            return;
         }
      } else {
         var10000 = false;
      }

      boolean hovering = var10000;
      double var10001 = this.Charlie;
      double var10002;
      if (hovering) {
         var10002 = (double)Global.Oliver.method_1534();
         "".length();
         if (null != null) {
            return;
         }
      } else {
         var10002 = (double)(-Global.Oliver.method_1534());
      }

      this.Charlie = var10001 + var10002;
      this.Charlie = MathUtils.clamp(-1.5D, this.Charlie, 1.5D);
      if (Global.Thomas.Jack.Harry) {
         if (lIIIIllIlIl((y1 * 23432.0D + (double)System.currentTimeMillis()) % 5000.0D * 2.0D, 5000.0D) < 0) {
            var10000 = true;
            "".length();
            if ((144 ^ 148) == "   ".length()) {
               return;
            }
         } else {
            var10000 = false;
            "".length();
            if (" ".length() < "".length()) {
               return;
            }
         }
      } else {
         var10000 = this.Jacob.Jack();
      }

      boolean enabled = var10000;
      var10001 = this.Thomas;
      if (enabled) {
         var10002 = (double)Global.Oliver.method_1534();
         "".length();
         if ((77 + 54 - 69 + 93 ^ 145 + 70 - 124 + 67) == 0) {
            return;
         }
      } else {
         var10002 = (double)(-Global.Oliver.method_1534());
      }

      this.Thomas = var10001 + var10002;
      this.Thomas = MathUtils.clamp(-1.5D, this.Thomas, 1.5D);
      if (hovering) {
         this.Oscar();
      }

      this.Oliver(x4, x3, y1, y2, hovering);
      this.Oliver(x1, y1);
      "".length();
      if ("   ".length() > "  ".length()) {
         ;
      }
   }

   public double Oliver() {
      double var1 = (double)Global.Harry.getGeneric().getWidth(this.Jacob.Susan()) + 25.0D;
      "".length();
      return -" ".length() != -" ".length() ? 0.0D : var1;
   }

   public double George() {
      double var1 = 11.0D;
      "".length();
      return -"   ".length() >= 0 ? 0.0D : var1;
   }

   private void Oliver(double x1, double x3, double y1, double y2, boolean hovering) {
      Color optColor = ThemeHelper.getColor2();
      int hoverColor = (int)(this.Harry.eval((float)(this.Charlie / 3.0D + 0.5D)).y * 10.0F);
      RenderUtils.drawRoundedRectWithShadow(x1, y1, x3, y2, 1.5D, (new Color(MathUtils.clamp(0, optColor.getRed() + hoverColor, 255), MathUtils.clamp(0, optColor.getGreen() + hoverColor, 255), MathUtils.clamp(0, optColor.getBlue() + hoverColor, 255))).getRGB(), 1.0D, 1.0D, 0.0D, (new Color(MathUtils.clamp(0, optColor.getRed() - 15, 255), MathUtils.clamp(0, optColor.getGreen() - 15, 255), MathUtils.clamp(0, optColor.getBlue() - 15, 255))).getRGB());
      Color rgb = ThemeManager.getPrimaryColor(y1 * 3.0D);
      Color rgbs = ThemeManager.getPrimaryColor(y2 * 3.0D);
      int alpha = (int)(this.Harry.eval((float)(this.Thomas / 3.0D + 0.5D)).y * 255.0F);
      RenderUtils.drawRoundedGradientRect(x1, y1, x3, y2, 1.5D, 90.0D, new Color(MathUtils.clamp(0, rgb.getRed() + hoverColor, 255), MathUtils.clamp(0, rgb.getGreen() + hoverColor, 255), MathUtils.clamp(0, rgb.getBlue() + hoverColor, 255), MathUtils.clamp(0, alpha, 255)), new Color(MathUtils.clamp(0, rgbs.getRed() + hoverColor, 255), MathUtils.clamp(0, rgbs.getGreen() + hoverColor, 255), MathUtils.clamp(0, rgbs.getBlue() + hoverColor, 255), MathUtils.clamp(0, alpha, 255)));
      RenderUtils.drawRoundedRectWithShadow(x1, y1, x3, y2, 1.5D, (new Color(0, 0, 0, 0)).getRGB(), 0.0D, 0.0D, 5.0D, (new Color(MathUtils.clamp(0, rgb.getRed() + hoverColor, 255), MathUtils.clamp(0, rgb.getGreen() + hoverColor, 255), MathUtils.clamp(0, rgb.getBlue() + hoverColor, 255), MathUtils.clamp(0, (int)((float)alpha / (ThemeHelper.getShadowFactor() * 3.0F)), 255))).getRGB());
      "".length();
      if (-" ".length() == -" ".length()) {
         ;
      }
   }

   public CheckboxGUI( BooleanSetting setting) {
      this.Jacob = setting;
      this.Oliver = setting;
      this.Harry(this.Oliver());
      this.Jacob(this.George());
      "".length();
      if (null != null) {
         throw null;
      }
   }

   static {
      "".length();
      if ("   ".length() > 0) {
         ;
      }
   }

   private static int lIIIIllIlll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private void Oliver(double x3, double y1) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable(3553);
      String name = this.Jacob.Susan();
      Global.Harry.getGeneric().drawStringWithShadow(name, x3, y1, ThemeHelper.getFontColor().getRGB());
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      "".length();
      if (-" ".length() <= "   ".length()) {
         ;
      }
   }

   private static int lIIIIllIllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Oliver(double mouseX, double mouseY, int mouseButton) {
      switch(mouseButton) {
      case 0:
         if (this.Jacob != null) {
            BooleanSetting var10000 = this.Jacob;
            boolean var10001;
            if (!this.Jacob.Jack()) {
               var10001 = true;
               "".length();
               if ("   ".length() >= (173 ^ 169)) {
                  return;
               }
            } else {
               var10001 = false;
            }

            var10000.Oliver(var10001);
            "".length();
            if (-" ".length() >= " ".length()) {
               return;
            }
         }
         break;
      case 1:
         if (this.Jacob != null) {
            this.Jacob.Oliver(this.Jacob.Harry());
         }
      }

      "".length();
      if (-"   ".length() <= 0) {
         ;
      }
   }

   private void Oscar() {
      String tooltip = this.Jacob.Oliver();
      this.Jack.Oliver(tooltip);
      "".length();
      if ((123 ^ 127) != 0) {
         ;
      }
   }

   private static int lIIIIllIlIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }
}
