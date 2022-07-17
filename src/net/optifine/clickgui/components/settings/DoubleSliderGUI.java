package net.optifine.clickgui.components.settings;

import com.sun.javafx.geom.CubicCurve2D;
import net.optifine.Global;
import net.optifine.config.DoubleSliderSetting;
import net.optifine.mixinterface.IKeyBinding;
import net.optifine.util.font.TTFFontRenderer;
import net.optifine.util.math.MathUtils;
import net.optifine.util.render.RenderUtils;
import net.optifine.util.theme.ThemeManager;
import net.optifine.util.theme.ThemeManager.ThemeHelper;
import net.minecraft.class_4587;
import net.optifine.clickgui.ClickGui;
import net.optifine.clickgui.SettingGUI;
import net.optifine.clickgui.window.AbstractWindow;
import org.lwjgl.opengl.GL11;

import java.awt.*;

public class DoubleSliderGUI extends SettingGUI {
   // $FF: synthetic field
   private double James = 0.0D;
   // $FF: synthetic field
   private final double Charlie = -1.5D;
   // $FF: synthetic field
   private final DoubleSliderSetting William;
   // $FF: synthetic field
   private double Jacob = -1.5D;
   // $FF: synthetic field
   private double George;
   // $FF: synthetic field
   private boolean Mary;
   // $FF: synthetic field
   private final CubicCurve2D Harry = new CubicCurve2D(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   // $FF: synthetic field
   private double Thomas;
   // $FF: synthetic field
   private boolean Patricia;
   // $FF: synthetic field
   private double Oscar = 0.0D;
   // $FF: synthetic field
   private final ClickGui Jack = Global.Charlie();

   private static int llIlllllIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public double Oliver() {
      TTFFontRenderer fr = Global.Harry.getGeneric();
      double nameWitdh = (double)fr.getWidth(this.William.Susan());
      double valueWidth = (double)fr.getWidth(String.valueOf((new StringBuilder()).append(this.William.Oscar()).append(" ").append(this.William.James())));
      double var5 = nameWitdh + valueWidth + 6.0D;
      "".length();
      return "".length() >= " ".length() ? 0.0D : var5;
   }

   public void Oliver(double mouseX, double mouseY, int mouseButton) {
      if (llIlllllII(mouseY, this.Harry()) < 0) {
         "".length();
         if (-" ".length() > "".length()) {
            return;
         }
      } else {
         switch(mouseButton) {
         case 0:
            this.Oscar();
            "".length();
            if ("".length() != 0) {
               return;
            }
            break;
         case 1:
            this.James();
         }

         "".length();
         if (" ".length() <= 0) {
            return;
         }
      }

   }

   private boolean Oliver(double mouseX, double mouseY, double x1, double x2, double y1, double y2) {
      AbstractWindow parent = this.Thomas();
      boolean scrollEnabled = parent.Elizabeth();
      double var10000;
      if (scrollEnabled) {
         var10000 = parent.Patricia();
         "".length();
         if ("".length() == "   ".length()) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0.0D;
      }

      double scroll = var10000;
      byte var17;
      if (llIllllllI(mouseX, x1) >= 0 && llIllllllI(mouseY, y1) >= 0 && llIlllllll(mouseX, x2) < 0 && llIlllllll(mouseY, y2) < 0 && llIllllllI(mouseY, -scroll) >= 0 && llIlllllll(mouseY, parent.Charlie() - 25.0D - scroll) < 0) {
         var17 = 1;
         "".length();
         if ((176 ^ 181) == 0) {
            return (boolean)"".length();
         }
      } else {
         var17 = 0;
      }

      byte var16 = var17;
      "".length();
      return (boolean)(-"  ".length() >= 0 ? "".length() : var16);
   }

   private void Jack(double x1, double y1) {
      TTFFontRenderer tr = Global.Harry.getGeneric();
      String name = this.William.Susan();
      tr.drawStringWithShadow(name, x1 + 5.0D, y1, ThemeHelper.getFontColor().getRGB());
      "".length();
      if ((68 + 157 - 92 + 28 ^ 14 + 11 - -103 + 37) != 0) {
         ;
      }
   }

   public double George() {
      double var1 = 71.0D;
      "".length();
      return "".length() <= -" ".length() ? 0.0D : var1;
   }

   private void Oliver(double mouseX, double mouseY) {
      String valueX = String.valueOf((new StringBuilder()).append("").append((double)((int)(this.William.Oscar() * 1000.0D)) / 1000.0D));
      String valueY = String.valueOf((new StringBuilder()).append("").append((double)((int)(this.William.James() * 1000.0D)) / 1000.0D));
      int alpha = (int)(this.Harry.eval((float)(this.Jacob / 3.0D + 0.5D)).y * 255.0F);
      Color rgb = new Color(11184810);
      double wX = (double)Global.Harry.getSmallMain().getWidth(valueX);
      double wY = (double)Global.Harry.getSmallMain().getWidth(valueY);
      Global.Harry.getSmallMain().drawStringWithShadow(valueX, mouseX - wX - 3.0D, this.George, (new Color(rgb.getRed(), rgb.getGreen(), rgb.getBlue(), MathUtils.clamp(0, alpha, 255))).getRGB());
      TTFFontRenderer var10000 = Global.Harry.getSmallMain();
      double var10002 = this.Thomas;
      double var10003;
      if (lllIIIIIII(Math.abs(this.Thomas - (this.Jack() + this.Jacob())), wY) < 0) {
         var10003 = wY - 3.0D;
         "".length();
         if (" ".length() < 0) {
            return;
         }
      } else {
         var10003 = wY / 2.0D;
      }

      var10000.drawStringWithShadow(valueY, var10002 - var10003, this.Harry() + this.George() - 1.8D, (new Color(rgb.getRed(), rgb.getGreen(), rgb.getBlue(), MathUtils.clamp(0, alpha, 255))).getRGB());
      "".length();
      if ("   ".length() >= 0) {
         ;
      }
   }

   private void James() {
      this.William.Oliver(this.William.Jack());
      this.William.Jack(this.William.Harry());
      "".length();
      if (" ".length() != 0) {
         ;
      }
   }

   public void Oliver(class_4587 matrixStack, double mouseX, double mouseY, float partialTicks) {
      double x1 = this.Jack();
      double x2 = x1 + this.Jacob();
      double x3 = x2 - this.Jacob() / 3.0D;
      double x4 = x2 - 4.0D;
      double y1 = this.Harry();
      double y2 = y1 + this.Charlie();
      if (this.Mary) {
         if (!this.Jack.Harry()) {
            this.Mary = false;
            "".length();
            if (-"   ".length() > 0) {
               return;
            }
         } else {
            boolean pressed = ((IKeyBinding)Global.Oliver.field_1690.field_1867).isActallyPressed();
            double yDiff = y2 - y1;
            double xDiff = x4 - x3;
            double mousePercentageX = (mouseX - x3) / xDiff;
            double mousePercentageY = (mouseY - y1) / yDiff;
            if (pressed) {
               mousePercentageX = this.William.Oscar() + (mouseX - this.Oscar) * 0.001D;
               mousePercentageY = this.William.William() + (mouseY - this.James) * 0.001D;
            }

            this.William.Oliver(mousePercentageX);
            this.William.Jack(mousePercentageY);
         }
      }

      boolean var10001;
      if (this.Oliver(mouseX, mouseY, x3, x4, y1, y2) && !this.Jack.Jacob) {
         var10001 = true;
         "".length();
         if (-(3 ^ 121 ^ 20 ^ 106) >= 0) {
            return;
         }
      } else {
         var10001 = false;
      }

      this.Patricia = var10001;
      if (this.Patricia && llIlllllIl(mouseY, this.Harry()) > 0) {
         this.William();
      }

      double var28 = this.Jacob;
      double var10002;
      if (!this.Patricia && !this.Mary) {
         var10002 = (double)(-Global.Oliver.method_1534());
      } else {
         var10002 = (double)Global.Oliver.method_1534();
         "".length();
         if (null != null) {
            return;
         }
      }

      this.Jacob = var28 + var10002;
      this.Jacob = MathUtils.clamp(-1.5D, this.Jacob, 2.0D);
      this.Oliver(x3, x4, y1 + 3.0D, y2 - 4.0D);
      this.Jack(x1, y1);
      this.Oscar = mouseX;
      this.James = mouseY;
      "".length();
      if ((34 + 58 - 85 + 154 ^ 49 + 46 - -64 + 5) > 0) {
         ;
      }
   }

   private static int llIllllllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   static {
      "".length();
      if (-" ".length() < 0) {
         ;
      }
   }

   public DoubleSliderGUI( DoubleSliderSetting setting) {
      this.William = setting;
      this.Oliver = setting;
      this.Harry(this.Oliver());
      this.Jacob(this.George());
      this.Thomas = this.Jack() + this.Jacob() - this.Jacob() / 3.0D;
      "".length();
      if ((122 ^ 126) < 0) {
         throw null;
      }
   }

   private static int lllIIIIIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private void Oscar() {
      this.Mary = true;
      "".length();
      if (null == null) {
         ;
      }
   }

   private static int llIlllllll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int llIlllllII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private void Oliver(double x3, double x4, double y4, double y5) {
      double xl1 = x3;
      double xl2 = x4 - 1.0D;
      Color hovered = ThemeHelper.getColor();
      int hoverColor = (int)this.Harry.eval((float)(this.Jacob / 3.0D + 0.5D)).y;
      RenderUtils.drawRoundedRect((double)((float)x3), y4, (double)((float)xl2 + 1.0F), y5 + 1.0D, 2.0D, (new Color(MathUtils.clamp(0, hovered.getRed(), 255), MathUtils.clamp(0, hovered.getGreen(), 255), MathUtils.clamp(0, hovered.getBlue(), 255))).getRGB());
      RenderUtils.drawRoundedRect((double)((float)x3), y4, (double)((float)xl2), y5, 2.0D, (new Color(MathUtils.clamp(0, hovered.getRed() + 4 + hoverColor, 255), MathUtils.clamp(0, hovered.getGreen() + 4 + hoverColor, 255), MathUtils.clamp(0, hovered.getBlue() + 4 + hoverColor, 255))).getRGB());
      Color lineEnd = new Color(MathUtils.clamp(0, hovered.getRed() + 12, 255), MathUtils.clamp(0, hovered.getGreen() + 12, 255), MathUtils.clamp(0, hovered.getBlue() + 12, 255), 0);
      int i = 1;

      Color lineStart;
      int var10001;
      double x;
      double x2;
      while(i < 6) {
         x = y4 + (y5 - y4) / 6.0D * (double)i - 1.0D;
         x2 = y4 + (y5 - y4) / 6.0D * (double)i + 1.0D;
         int index = Math.abs(3 - i);
         if (index == 0) {
            var10001 = 2;
            "".length();
            if (" ".length() == (146 ^ 150)) {
               return;
            }
         } else {
            var10001 = index;
         }

         int alpha = 255 / var10001;
         lineStart = new Color(MathUtils.clamp(0, hovered.getRed() + 12, 255), MathUtils.clamp(0, hovered.getGreen() + 12, 255), MathUtils.clamp(0, hovered.getBlue() + 12, 255), alpha);
         RenderUtils.drawGradientRect(xl1, x, xl1 + (xl2 - xl1) / 2.2D, x2, lineStart, lineEnd, lineEnd, lineStart);
         RenderUtils.drawGradientRect(xl1 + (xl2 - xl1) / 2.2D, x, xl2 - (xl2 - xl1) / 2.2D, x2, lineStart, lineStart);
         RenderUtils.drawGradientRect(xl2 - (xl2 - xl1) / 2.2D, x, xl2 - 2.0D, x2, lineEnd, lineStart, lineStart, lineEnd);
         ++i;
         "".length();
         if ((193 ^ 197) < 0) {
            return;
         }
      }

      i = 1;

      while(i < 8) {
         x = xl1 + (xl2 - xl1) / 8.0D * (double)i;
         x2 = x + 2.0D;
         double y1 = y4 + (y5 - y4) / 2.2D;
         double y2 = y5 - (y5 - y4) / 2.2D;
         int index = Math.abs(4 - i);
         if (index == 0) {
            var10001 = 2;
            "".length();
            if (-" ".length() != -" ".length()) {
               return;
            }
         } else {
            var10001 = index;
         }

         int alpha = 255 / var10001;
         lineStart = new Color(MathUtils.clamp(0, hovered.getRed() + 12, 255), MathUtils.clamp(0, hovered.getGreen() + 12, 255), MathUtils.clamp(0, hovered.getBlue() + 12, 255), alpha);
         RenderUtils.drawGradientRect(x, y4 - 2.0D, x2, y1, lineEnd, lineEnd, lineStart, lineStart);
         RenderUtils.drawGradientRect(x, y1, x2, y2, lineStart, lineStart);
         RenderUtils.drawGradientRect(x, y2, x2, y5 + 2.0D, lineStart, lineStart, lineEnd, lineEnd);
         ++i;
         "".length();
         if (-"   ".length() > 0) {
            return;
         }
      }

      double var30 = xl2 - xl1;
      double var10002;
      if (Global.Thomas.Jack.Harry) {
         var10002 = 0.2D + (y4 * 23432.0D + (double)System.currentTimeMillis()) % 5000.0D * 2.0D / 10000.0D * 0.6D;
         "".length();
         if ((179 + 51 - 168 + 123 ^ 20 + 43 - 8 + 133) == 0) {
            return;
         }
      } else {
         var10002 = this.William.Oscar();
      }

      double targetX = xl1 + var30 * var10002;
      var30 = y5 - y4;
      if (Global.Thomas.Jack.Harry) {
         var10002 = 0.2D + (y4 * 23432.0D + (double)System.currentTimeMillis()) % 5000.0D * 2.0D / 10000.0D * 0.6D;
         "".length();
         if ("  ".length() <= 0) {
            return;
         }
      } else {
         var10002 = this.William.William();
      }

      double targetY = y4 + var30 * var10002;
      double posX = this.Thomas + (targetX - this.Thomas) * Math.pow((double)Global.Oliver.method_1534() / 20.0D, 0.5D);
      double posY = this.George + (targetY - this.George) * Math.pow((double)Global.Oliver.method_1534() / 20.0D, 0.5D);
      this.Thomas = posX;
      this.George = posY;
      float width = (float)Global.Oliver.method_22683().method_4486() / 600.0F;
      boolean txt = GL11.glIsEnabled(3553);
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      Color primaryColor = ThemeManager.getPrimaryColor(y4 * 3.0D);
      int pr = (new Color(primaryColor.getRed(), primaryColor.getGreen(), primaryColor.getBlue(), 30)).getRGB();
      ThemeManager.usePrimaryColor(1.0F, posY * 3.0D);
      RenderUtils.drawRoundedRectWithShadow(xl1, posY - 0.75D, xl2, posY + 0.75D, 0.0D, primaryColor.getRGB(), 0.0D, 0.0D, 15.0D, pr);
      RenderUtils.drawRoundedRectWithShadow(posX - 0.75D, y4, posX + 0.75D, y5, 0.0D, primaryColor.getRGB(), 0.0D, 0.0D, 15.0D, pr);
      GL11.glDisable(3042);
      if (this.Mary || this.Patricia) {
         this.Oliver(xl1, y4);
      }

      "".length();
      if (-"  ".length() < 0) {
         ;
      }
   }

   private void William() {
      if (!this.Mary) {
         this.Jack.Oliver(String.valueOf((new StringBuilder()).append(this.William.Oliver()).append("\nPress CTRL or your sprint button to make setting more sensitive.")));
      }

      "".length();
      if (-" ".length() < 0) {
         ;
      }
   }
}
