package net.optifine.clickgui.window;

import net.minecraft.class_1041;
import net.minecraft.class_4587;
import net.optifine.clickgui.PartOfGUI;
import net.optifine.features.module.Category;
import net.optifine.features.module.hud.ClickGuiModule;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.Iterator;
import java.util.stream.Stream;

public final class SettingsWindow extends AbstractWindow {
   // $FF: synthetic field
   public Category Thomas;
   // $FF: synthetic field
   public double George = 0.0D;

   public void Oliver(class_4587 matrixStack, int mouseX, int mouseY, float partialTicks) {
      ClickGuiModule clickGui = Global.Jack().Elizabeth;
      this.Charlie((double)Global.Oliver.method_22683().method_4502() * 0.7D);
      this.George();
      this.Jessica();
      this.Margaret();
      double windowStartX = this.Jack();
      double windowStartY = this.Harry();
      double windowEndX = windowStartX + this.Jacob();
      double windowEndY = windowStartY + this.Charlie();
      double titleEndY = windowStartY + 25.0D;
      if (lIIlIlllII((double)mouseX, windowStartX) >= 0 && lIIlIlllII((double)mouseY, windowStartY) >= 0 && lIIlIlllIl((double)mouseX, windowEndX) < 0 && lIIlIlllIl((double)mouseY, windowEndY) < 0) {
         Global.Charlie().Oliver("");
      }

      GL11.glDisable(3553);
      if (clickGui.Linda()) {
         RenderUtils.drawRoundedRect(windowStartX - 2.0D, windowStartY - 2.0D, windowEndX + 2.0D, windowEndY + 5.0D, 2.0D, ThemeHelper.getColor().getRGB());
         RenderUtils.drawRoundedRect(windowStartX - 1.5D, windowStartY - 1.5D, windowEndX + 1.5D, windowEndY + 4.5D, 2.0D, ThemeHelper.getHoveredColor().getRGB());
         RenderUtils.drawRoundedRect(windowStartX - 1.0D, windowStartY - 1.0D, windowEndX + 1.0D, windowEndY + 5.0D, 2.0D, ThemeHelper.getColor().getRGB());
         RenderUtils.drawRoundedRect(windowStartX - 0.5D, windowStartY - 0.5D, windowEndX + 0.5D, windowEndY + 3.5D, 2.0D, ThemeHelper.getHoveredColor().getRGB());
      }

      Color bg = ThemeHelper.getFadeColor();
      if (lIIlIlllII(this.Charlie(), 25.0D) > 0) {
         RenderUtils.drawRoundedRect(windowStartX, titleEndY - 4.0D, windowEndX, windowEndY + 3.0D, 2.0D, ThemeHelper.getColor().getRGB());
         if (!clickGui.Margaret()) {
            RenderUtils.drawGradientRect(windowStartX, titleEndY - 2.0D, windowEndX, windowEndY + 2.0D, bg, new Color(bg.getRed(), bg.getGreen(), bg.getBlue(), 0));
         }

         double y4 = titleEndY + this.Patricia();
         class_1041 sr = Global.Oliver.method_22683();
         double sf = sr.method_4495();
         GL11.glScissor((int)(windowStartX * sf), (int)(((double)sr.method_4502() - windowEndY) * sf), (int)(this.Jacob() * sf), (int)((windowEndY - titleEndY) * sf));
         GL11.glEnable(3089);
         GL11.glPushMatrix();
         GL11.glTranslated(windowStartX, y4, 0.0D);
         double cMouseX = (double)mouseX - windowStartX;
         double cMouseY = (double)mouseY - y4;
         int i = 0;

         while(i < this.James()) {
            this.Oliver(i).Oliver(matrixStack, cMouseX, cMouseY, partialTicks);
            ++i;
            "".length();
            if ("".length() > 0) {
               return;
            }
         }

         GL11.glPopMatrix();
         GL11.glDisable(3089);
      }

      RenderUtils.drawRoundedRectWithShadow(windowStartX, windowStartY + 2.0D, windowEndX, windowEndY, 2.0D, 0, 0.0D, 0.0D, 15.0D, ThemeHelper.getColor().getRGB());
      RenderUtils.drawRoundedRect(windowStartX, windowStartY, windowEndX, titleEndY, 2.0D, ThemeHelper.getColor().getRGB());
      if (clickGui.Margaret() && lIIlIlllII(this.Charlie(), 25.0D) > 0) {
         RenderUtils.drawRoundedRect(windowStartX + 6.0D, titleEndY - 3.0D, windowEndX - 6.0D, titleEndY - 2.5D, 0.25D, bg.getRGB());
      }

      TTFFontRenderer font = Global.Harry.getGeneric();
      float h = (float)(12.5D - (double)(font.getHeight(this.Oliver()) / 2.0F));
      font.drawString(String.valueOf((new StringBuilder()).append("§l").append(this.Oliver())), windowStartX + 6.0D, windowStartY + (double)h, ThemeHelper.getHeaderTextColor().getRGB());
      "".length();
      "".length();
      if (null == null) {
         ;
      }
   }

   private static int lIIlIlllIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public SettingsWindow(Feature feature, CategoryWindow parent) {
      super(String.valueOf((new StringBuilder()).append(feature.getName()).append(" Settings")));
      this.Thomas = parent.George;
      Stream<Setting> settings = feature.getSettings().values().stream();
      settings.map(Setting::Jacob).forEach(this::Oliver);
      this.Charlie((double)Global.Oliver.method_22683().method_4502() * 0.7D);
      this.Thomas();
      "".length();
      if ("   ".length() < 0) {
         throw null;
      }
   }

   private static int lIIlIlllII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   static {
      "".length();
      if ("  ".length() <= (8 ^ 99 ^ 9 ^ 102)) {
         ;
      }
   }

   private void Jessica() {
      if (this.Jacob) {
         this.George -= (double)(Global.Oliver.method_1534() / 2.0F) * (1.0D - Math.abs(this.George * 2.0D - 1.0D) + 0.01D);
         "".length();
         if ("  ".length() < 0) {
            return;
         }
      } else {
         this.George += (double)(Global.Oliver.method_1534() / 2.0F) * (1.0D - Math.abs(this.George * 2.0D - 1.0D) + 0.01D);
      }

      this.George = MathUtils.clamp(0.0D, this.George, 1.0D);
      this.Jacob(this.George * this.Mary() + 25.0D);
      this.Jack((double)Global.Oliver.method_22683().method_4502() / 2.0D - this.Charlie() / 2.0D);
      "".length();
      if ("".length() <= 0) {
         ;
      }
   }

   private void Sarah() {
      class_1041 w = Global.Oliver.method_22683();
      this.Oliver(Math.max((double)w.method_4486() / 2.0D - this.Jacob() / 2.0D, (double)w.method_4486() * 0.04D + CategoryWindow.Thomas * 2.0D));
      this.Harry(Math.min(Math.max((double)Global.Oliver.method_22683().method_4486() / 3.0D, 300.0D), (double)w.method_4486() - this.Jack() - (double)w.method_4486() * 0.02D));
      this.Jack((double)w.method_4502() / 2.0D - this.Mary() / 2.0D);
      "".length();
      if ("".length() == "".length()) {
         ;
      }
   }

   public void George() {
      super.George();
      this.Sarah();
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   private void Margaret() {
      double scroll = this.Patricia() + this.Jennifer();
      this.Thomas(scroll);
      this.George(this.Jennifer() / Math.pow(2.0D, (double)Global.Oliver.method_1534()));
      "".length();
      if ((121 ^ 125) > "   ".length()) {
         ;
      }
   }

   public void Thomas() {
      double childrenHeight = 25.0D;
      Iterator var3 = this.Oliver.iterator();

      while(var3.hasNext()) {
         PartOfGUI c = ( PartOfGUI )var3.next();
         childrenHeight += c.Charlie() + 2.0D;
         "".length();
         if ("".length() != 0) {
            return;
         }
      }

      childrenHeight += 2.0D;
      if (lIIlIllIll(childrenHeight, this.Charlie + 25.0D) > 0 && lIIlIllIll(this.Charlie, 0.0D) > 0) {
         this.Jacob(this.Charlie + 25.0D);
         "".length();
         if (" ".length() >= "   ".length()) {
            return;
         }
      } else {
         this.Jacob(childrenHeight);
      }

      this.George();
      "".length();
      if ((156 ^ 152) != 0) {
         ;
      }
   }

   private static int lIIlIllIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }
}
