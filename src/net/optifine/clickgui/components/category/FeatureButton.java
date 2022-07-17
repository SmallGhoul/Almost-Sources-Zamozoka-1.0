package net.optifine.clickgui.components.category;

import net.minecraft.class_4587;
import net.optifine.clickgui.ClickGui;
import net.optifine.clickgui.PartOfGUI;
import net.optifine.clickgui.window.AbstractWindow;
import net.optifine.clickgui.window.CategoryWindow;
import net.optifine.clickgui.window.SettingsWindow;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.Objects;

public final class FeatureButton extends PartOfGUI {
   // $FF: synthetic field
   private SettingsWindow Jacob;
   // $FF: synthetic field
   private final Feature Jack;
   // $FF: synthetic field
   private final ClickGui Oliver = Global.Charlie();
   // $FF: synthetic field
   private final boolean Harry;

   private boolean Oscar() {
      byte var10000;
      if (this.Jacob != null && !this.Jacob.Linda()) {
         var10000 = 1;
         "".length();
         if (null != null) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var1 = var10000;
      "".length();
      return (boolean)(-(115 + 7 - 92 + 99 ^ 60 + 85 - 29 + 16) >= 0 ? "".length() : var1);
   }

   public double Oliver() {
      String name = this.Jack.getName();
      float width = Global.Harry.getGeneric().getWidth(name) + 4.0F;
      if (this.Harry) {
         width += 13.0F;
      }

      double var3 = (double)width;
      "".length();
      return null != null ? 0.0D : var3;
   }

   public void Oliver(double mouseX, double mouseY, int mouseButton) {
      if (this.Harry && (mouseButton == 1 || this.Jack.getPrimaryAction().isEmpty())) {
         if (this.Oscar()) {
            this.William();
            "".length();
            if (null != null) {
               return;
            }
         } else {
            this.James();
         }

         "".length();
         if ((109 + 36 - 24 + 26 ^ 25 + 45 - -76 + 5) == 0) {
            return;
         }
      } else {
         this.Jack.doPrimaryAction();
         "".length();
         if (-"   ".length() > 0) {
            return;
         }
      }

   }

   private void Oliver(double x1, double y1) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable(3553);
      TTFFontRenderer mainFont = Global.Harry.getGeneric();
      String name = this.Jack.getName();
      boolean dots = Global.Jack().Elizabeth.Jack.Jack();
      String var10001;
      String var10002;
      StringBuilder var8;
      if (this.Jack.isEnabled()) {
         if (dots) {
            if (this.Jack.isEnabled()) {
               var10001 = "+";
               "".length();
               if ("".length() > (65 + 143 - 68 + 4 ^ 9 + 82 - -32 + 25)) {
                  return;
               }
            } else {
               var10001 = "-";
               "".length();
               if ((29 ^ 25) < " ".length()) {
                  return;
               }
            }
         } else {
            var10001 = "";
         }

         mainFont.drawStringWithShadow(var10001, x1 + 1.0D, y1 - 2.0D, ThemeManager.getPrimaryColor(y1 * 3.0D).getRGB());
         var8 = new StringBuilder();
         if (dots) {
            var10002 = "  ";
            "".length();
            if ("   ".length() < "  ".length()) {
               return;
            }
         } else {
            var10002 = "";
         }

         mainFont.drawStringWithShadow(String.valueOf(var8.append(var10002).append(name)), x1 + 3.0D, y1 - 2.0D, ThemeManager.getPrimaryColor(y1 * 3.0D).getRGB());
         "".length();
         if (-"  ".length() > 0) {
            return;
         }
      } else {
         if (dots) {
            if (this.Jack.isEnabled()) {
               var10001 = "+";
               "".length();
               if ("".length() <= -" ".length()) {
                  return;
               }
            } else {
               var10001 = "-";
               "".length();
               if ("".length() >= "   ".length()) {
                  return;
               }
            }
         } else {
            var10001 = "";
         }

         mainFont.drawStringWithShadow(var10001, x1 + 1.0D, y1 - 2.0D, ThemeHelper.getFontColor().getRGB());
         var8 = new StringBuilder();
         if (dots) {
            var10002 = "  ";
            "".length();
            if ("".length() != 0) {
               return;
            }
         } else {
            var10002 = "";
         }

         mainFont.drawStringWithShadow(String.valueOf(var8.append(var10002).append(name)), x1 + 3.0D, y1 - 2.0D, ThemeHelper.getFontColor().getRGB());
      }

      GL11.glDisable(3553);
      GL11.glEnable(3042);
      "".length();
      if ("   ".length() >= "  ".length()) {
         ;
      }
   }

   private static int lIIIIlIIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Oliver(class_4587 matrixStack, double mouseX, double mouseY, float partialTicks) {
      double x1 = this.Jack();
      double x2 = x1 + this.Jacob();
      double y1 = this.Harry();
      double y2 = y1 + this.Charlie();
      boolean hovering = this.Oliver(mouseX, mouseY, x1, x2, y1, y2);
      boolean var10000;
      if (hovering && lIIIIIllIl(mouseX, x2) < 0) {
         var10000 = true;
         "".length();
         if ("".length() >= (240 ^ 174 ^ 252 ^ 166)) {
            return;
         }
      } else {
         var10000 = false;
      }

      boolean moduleHovered = var10000;
      if (moduleHovered) {
         this.Mary();
      }

      if (this.Harry) {
         this.Oliver(x2, x2, y1, y2);
      }

      this.Oliver(x1, y1);
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   private static int lIIIIIlllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIIIIIllIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private void James() {
      this.Jacob = new SettingsWindow(this.Jack, (CategoryWindow)this.Thomas());
      this.Oliver.Oliver(this.Jacob);
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   public double George() {
      double var1 = 11.0D;
      "".length();
      return " ".length() != " ".length() ? 0.0D : var1;
   }

   private boolean Oliver(double mouseX, double mouseY, double x1, double x2, double y1, double y2) {
      AbstractWindow parent = this.Thomas();
      boolean scrollEnabled = parent.Elizabeth();
      double var10000;
      if (scrollEnabled) {
         var10000 = parent.Patricia();
         "".length();
         if ((72 + 112 - 167 + 152 ^ 108 + 68 - 136 + 133) == 0) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0.0D;
      }

      double scroll = var10000;
      byte var17;
      if (lIIIIIlllI(mouseX, x1) >= 0 && lIIIIIlllI(mouseY, y1) >= 0 && lIIIIIllll(mouseX, x2) < 0 && lIIIIIllll(mouseY, y2) < 0 && lIIIIIlllI(mouseY, -scroll) >= 0 && lIIIIIllll(mouseY, parent.Charlie() - 25.0D - scroll) < 0) {
         var17 = 1;
         "".length();
         if ("".length() != 0) {
            return (boolean)"".length();
         }
      } else {
         var17 = 0;
      }

      byte var16 = var17;
      "".length();
      return (boolean)(-"  ".length() >= 0 ? "".length() : var16);
   }

   private static int lIIIIIllll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private void William() {
      this.Jacob.Susan();
      "".length();
      if ("  ".length() >= " ".length()) {
         ;
      }
   }

   private void Oliver(double x2, double x3, double y1, double y2) {
      Color theme = ThemeHelper.getHeaderTextColor();
      GL11.glColor4f((float)theme.getRed() / 255.0F, (float)theme.getGreen() / 255.0F, (float)theme.getBlue() / 255.0F, 1.0F);
      GL11.glLineWidth(2.0F);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glEnable(3042);
      if (this.Jacob != null && lIIIIlIIII(this.Jacob.George, 1.0D) == 0) {
         GL11.glBegin(1);
         GL11.glVertex2d(x2 - 6.0D, y1 + 4.0D);
         GL11.glVertex2d((x3 - 1.0D + (x2 - 6.0D)) / 2.0D, y2 - 4.0D);
         GL11.glEnd();
         GL11.glBegin(1);
         GL11.glVertex2d(x3 - 1.0D, y1 + 4.0D);
         GL11.glVertex2d((x3 - 1.0D + (x2 - 6.0D)) / 2.0D, y2 - 4.0D);
         GL11.glEnd();
         "".length();
         if ("   ".length() == 0) {
            return;
         }
      } else if (this.Jacob != null && !this.Jacob.Linda()) {
         RenderUtils.drawCircle((float)(x3 + x2) / 2.0F - 4.0F, (float)(y1 + y2) / 2.0F, 2.0F, ThemeHelper.getHeaderTextColor(), 0.5F, 1.0F, (float)this.Jacob.George);
      } else {
         GL11.glBegin(1);
         GL11.glVertex2d(x2 - 4.0D, y1 + 3.0D);
         GL11.glVertex2d(x3 - 2.0D, (y1 + y2) / 2.0D);
         GL11.glEnd();
         GL11.glBegin(1);
         GL11.glVertex2d(x3 - 2.0D, (y1 + y2) / 2.0D);
         GL11.glVertex2d(x2 - 4.0D, y2 - 3.0D);
         GL11.glEnd();
         "".length();
         if (null != null) {
            return;
         }
      }

      GL11.glDisable(2848);
      GL11.glLineWidth(1.0F);
      "".length();
      if ((37 + 25 - 1 + 89 ^ 50 + 90 - 124 + 130) > 0) {
         ;
      }
   }

   static {
      "".length();
      if (null == null) {
         ;
      }
   }

   private void Mary() {
      String tooltip = this.Jack.getDescription();
      this.Oliver.Oliver(tooltip);
      "".length();
      if (-" ".length() <= 0) {
         ;
      }
   }

   public FeatureButton(Feature feature) {
      this.Jack = (Feature)Objects.requireNonNull(feature);
      this.Harry(this.Oliver());
      this.Jacob(this.George());
      boolean var10001;
      if (!feature.getSettings().isEmpty()) {
         var10001 = true;
         "".length();
         if (null != null) {
            throw null;
         }
      } else {
         var10001 = false;
      }

      this.Harry = var10001;
      "".length();
      if ("   ".length() <= " ".length()) {
         throw null;
      }
   }
}
