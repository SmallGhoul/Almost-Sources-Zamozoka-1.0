package net.optifine.features.module.hud;

import com.mojang.blaze3d.systems.RenderSystem;
import net.optifine.Global;
import net.optifine.managers.event.events.HUDRenderListener;
import net.optifine.managers.event.events.HUDRenderListener.ExperienceBarRenderEvent;
import net.optifine.managers.event.events.HUDRenderListener.HeldItemToolTipRenderEvent;
import net.optifine.managers.event.events.HUDRenderListener.HotbarRenderEvent;
import net.optifine.managers.event.events.HUDRenderListener.StatusBarRenderEvent;
import net.optifine.util.font.TTFFontRenderer;
import net.optifine.util.math.MathUtils;
import net.optifine.util.render.Animation;
import net.optifine.util.render.RenderUtils;
import net.optifine.util.theme.Theme;
import net.optifine.util.theme.ThemeManager;
import net.minecraft.class_1799;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import org.lwjgl.opengl.GL11;

import java.awt.*;

public class HUD extends Module implements HUDRenderListener {
   // $FF: synthetic field
   Animation Charlie = new Animation();
   // $FF: synthetic field
   Animation Oscar = new Animation();
   // $FF: synthetic field
   Animation James = new Animation();
   // $FF: synthetic field
   Color Jack;
   // $FF: synthetic field
   Animation Jacob = new Animation();
   // $FF: synthetic field
   Animation Harry = new Animation();
   // $FF: synthetic field
   Animation William = new Animation();
   // $FF: synthetic field
   Animation George = new Animation();
   // $FF: synthetic field
   Animation Thomas = new Animation();

   public void Oliver(HeldItemToolTipRenderEvent event) {
      event.Oliver = false;
      float w = (float)mc.method_22683().method_4486();
      float h = (float)mc.method_22683().method_4502();
      int c = this.Oliver(false, 0.0D, this.Jack);
      class_1799 stack = mc.field_1724.method_6047();
      int count;
      int i;
      class_1799 s;
      String name;
      if (!stack.method_7960()) {
         count = 0;
         i = 0;

         while(i <= 40) {
            s = mc.field_1724.field_7514.method_5438(i);
            if (s.method_7909().equals(stack.method_7909())) {
               count += s.method_7947();
            }

            ++i;
            "".length();
            if ("   ".length() <= -" ".length()) {
               return;
            }
         }

         name = stack.method_7964().getString();
         if (count > 1) {
            name = String.valueOf((new StringBuilder()).append(name).append(" x").append(count));
         }

         Global.Harry.getSmallMain().drawString(name, (double)(w / 2.0F + 102.0F), (double)(h - 11.0F - Global.Harry.getSmallMain().getHeight(name) / 2.0F), c);
         "".length();
      }

      stack = mc.field_1724.method_6079();
      if (!stack.method_7960()) {
         count = 0;
         i = 0;

         while(i <= 40) {
            s = mc.field_1724.field_7514.method_5438(i);
            if (s.method_7909().equals(stack.method_7909())) {
               count += s.method_7947();
            }

            ++i;
            "".length();
            if ("  ".length() < "  ".length()) {
               return;
            }
         }

         name = stack.method_7964().getString();
         if (count > 1) {
            name = String.valueOf((new StringBuilder()).append(name).append(" x").append(count));
         }

         Global.Harry.getSmallMain().drawString(name, (double)(w / 2.0F - 135.0F - Global.Harry.getSmallMain().getWidth(name)), (double)(h - 11.0F - Global.Harry.getSmallMain().getHeight(name) / 2.0F), c);
         "".length();
      }

      "".length();
      if (-(42 ^ 15 ^ 8 ^ 40) < 0) {
         ;
      }
   }

   public void Oliver(ExperienceBarRenderEvent event) {
      event.Oliver = false;
      "".length();
      if ((104 ^ 108) == (57 ^ 61)) {
         ;
      }
   }

   private int Oliver(boolean isOnAccent, double offset, Color col) {
      int sum = 0;
      int count = 0;
      if (isOnAccent) {
         Color col1 = ThemeManager.getPrimaryColor(offset);
         ++count;
         sum = (int)((double)sum + (double)col1.getRed() * 1.1D);
         sum = (int)((double)sum + (double)col1.getGreen() * 1.2D);
         sum = (int)((double)sum + (double)col1.getBlue() * 0.5D);
      }

      if (col != null) {
         ++count;
         sum = (int)((double)sum + (double)col.getRed() * 1.1D);
         sum = (int)((double)sum + (double)col.getGreen() * 1.2D);
         sum = (int)((double)sum + (double)col.getBlue() * 0.8D);
      }

      int var10000;
      if (llIlIlll((float)sum / 3.0F / (float)count, 170.0F) > 0) {
         var10000 = -16777216;
         "".length();
         if ("  ".length() <= 0) {
            return "".length();
         }
      } else {
         var10000 = -1;
      }

      int var8 = var10000;
      "".length();
      return "   ".length() < -" ".length() ? "".length() : var8;
   }

   private static int llIllIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(HUDRenderListener.class, this);
      "".length();
      if ((216 ^ 166 ^ 126 ^ 4) >= "".length()) {
         ;
      }
   }

   private static int llIlIlll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   static {
      "".length();
      if (-"  ".length() < 0) {
         ;
      }
   }

   public void Oliver(StatusBarRenderEvent event) {
      event.Oliver = false;
      float w = (float)mc.method_22683().method_4486();
      float h = (float)mc.method_22683().method_4502();
      float offset = 0.0F;
      float exp = this.Charlie.get(mc.field_1724.field_7510);
      if (llIllIII((double)exp, 0.01D) > 0) {
         Global.Harry.getSmallMain().drawCenteredStringWithShadow(String.valueOf((new StringBuilder()).append(mc.field_1724.field_7520).append("")), (double)(w / 2.0F), (double)(h - 35.0F), -1);
         RenderUtils.drawRoundedRect((double)(w / 2.0F - 100.0F), (double)(h - 30.0F - offset), (double)(w / 2.0F - 100.0F + exp * 200.0F), (double)(h - 26.0F - offset), 2.0D, -9044107);
         offset += 6.0F;
      }

      float health = this.Jacob.get(mc.field_1724.method_6032() / mc.field_1724.method_6063());
      if (llIllIII((double)health, 0.01D) > 0) {
         RenderUtils.drawRoundedRect((double)(w / 2.0F - 100.0F), (double)(h - 30.0F - offset), (double)(w / 2.0F - 100.0F + health * 90.0F), (double)(h - 26.0F - offset), 2.0D, -42663);
         offset += 6.0F;
      }

      float absorption = this.Thomas.get(mc.field_1724.method_6067() / mc.field_1724.method_6063());
      if (llIllIII((double)absorption, 0.01D) > 0) {
         RenderUtils.drawRoundedRect((double)(w / 2.0F - 100.0F), (double)(h - 30.0F - offset), (double)(w / 2.0F - 100.0F + absorption * 90.0F), (double)(h - 26.0F - offset), 2.0D, -9411);
         offset += 6.0F;
      }

      Animation var10000 = this.William;
      float var10001;
      if (mc.field_1724.method_5809()) {
         var10001 = 1.0F;
         "".length();
         if (" ".length() <= -" ".length()) {
            return;
         }
      } else {
         var10001 = 0.0F;
      }

      float fire = var10000.get(var10001);
      if (llIllIII((double)fire, 0.01D) > 0) {
         RenderUtils.drawRoundedRect((double)(w / 2.0F - 100.0F), (double)(h - 30.0F - offset), (double)(w / 2.0F - 100.0F + fire * 90.0F), (double)(h - 26.0F - offset), 2.0D, -38592);
         offset += 6.0F;
      }

      float armor = this.George.get((float)mc.field_1724.method_6096() / 20.0F);
      if (llIllIII((double)armor, 0.01D) > 0) {
         RenderUtils.drawRoundedRect((double)(w / 2.0F - 100.0F), (double)(h - 30.0F - offset), (double)(w / 2.0F - 100.0F + armor * 90.0F), (double)(h - 26.0F - offset), 2.0D, -855310);
         GL11.glPushMatrix();
         double scale = 0.75D;
         GL11.glScaled(scale, scale, scale);
         int y = (int)(((double)(h - 30.0F - offset) - 16.0D * scale - 1.0D) / scale);
         GL11.glEnable(3553);
         mc.method_1480().method_4010(mc.field_1724.field_7514.method_7372(0), (int)((double)(w / 2.0F - 100.0F) / scale), y);
         mc.method_1480().method_4010(mc.field_1724.field_7514.method_7372(1), (int)(((double)(w / 2.0F - 100.0F) + 16.0D * scale) / scale), y);
         mc.method_1480().method_4010(mc.field_1724.field_7514.method_7372(2), (int)(((double)(w / 2.0F - 100.0F) + 16.0D * scale * 2.0D) / scale), y);
         mc.method_1480().method_4010(mc.field_1724.field_7514.method_7372(3), (int)(((double)(w / 2.0F - 100.0F) + 16.0D * scale * 3.0D) / scale), y);
         GL11.glPopMatrix();
      }

      offset = 0.0F;
      if (llIllIIl(mc.field_1724.field_7510, 0.0F) > 0) {
         offset += 6.0F;
      }

      float hunger = this.Oscar.get((float)mc.field_1724.method_7344().method_7586() / 20.0F);
      if (llIllIII((double)hunger, 0.01D) > 0) {
         RenderUtils.drawRoundedRect((double)(w / 2.0F + 100.0F - hunger * 90.0F), (double)(h - 30.0F - offset), (double)(w / 2.0F + 100.0F), (double)(h - 26.0F - offset), 2.0D, -29095);
         offset += 6.0F;
      }

      float actualAir = (float)mc.field_1724.method_5669() / (float)mc.field_1724.method_5748();
      if (llIllIlI(actualAir, 0.0F) < 0) {
         actualAir = (float)((double)actualAir / 0.05D);
         actualAir = MathUtils.clamp(-1.0F, actualAir, 1.0F);
      }

      var10000 = this.James;
      if (llIllIlI(actualAir, 1.0F) < 0) {
         var10001 = actualAir;
         "".length();
         if (" ".length() >= "  ".length()) {
            return;
         }
      } else {
         var10001 = 0.0F;
      }

      float air = var10000.get(var10001);
      if (llIllIlI(actualAir, 1.0F) < 0 || llIllIII((double)Math.abs(air), 0.05D) > 0 || mc.field_1724.method_5869()) {
         double var15 = (double)(w / 2.0F + 100.0F - Math.abs(air) * 90.0F);
         double var16 = (double)(h - 30.0F - offset);
         double var10002 = (double)(w / 2.0F + 100.0F);
         double var10003 = (double)(h - 26.0F - offset);
         int var10005;
         if (llIllIlI(air, 0.0F) < 0) {
            var10005 = -42663;
            "".length();
            if ("".length() != 0) {
               return;
            }
         } else {
            var10005 = -7352833;
         }

         RenderUtils.drawRoundedRect(var15, var16, var10002, var10003, 2.0D, var10005);
      }

      GL11.glDisable(3553);
      RenderSystem.disableTexture();
      "".length();
      if (null == null) {
         ;
      }
   }

   public void Oliver(HotbarRenderEvent event) {
      event.Oliver = false;
      float w = (float)mc.method_22683().method_4486();
      float h = (float)mc.method_22683().method_4502();
      Color var10001 = new Color;
      int var10003;
      if (ThemeManager.getSelectedTheme() == Theme.LIGHT) {
         var10003 = 16777215;
         "".length();
         if ("   ".length() == 0) {
            return;
         }
      } else {
         var10003 = 0;
      }

      var10001.<init>(var10003);
      this.Jack = var10001;
      GL11.glColor4f((float)this.Jack.getRed() / 255.0F, (float)this.Jack.getGreen() / 255.0F, (float)this.Jack.getBlue() / 255.0F, 0.5F);
      RenderUtils.drawRoundedRect(0.0D, (double)(h - 22.0F), (double)w, (double)h, 0.0D, (new Color((float)this.Jack.getRed() / 255.0F, (float)this.Jack.getGreen() / 255.0F, (float)this.Jack.getBlue() / 255.0F, 0.5F)).getRGB());
      float sl = this.Harry.get((float)mc.field_1724.field_7514.field_7545);
      RenderUtils.drawRoundedRect((double)(w / 2.0F) + 22.0D * ((double)sl - 4.5D), (double)(h - 22.0F), (double)(w / 2.0F) + 22.0D * ((double)sl - 3.5D), (double)h, 2.0D, ThemeManager.getPrimaryColor((double)(w / 2.0F + 22.0F * (sl - 4.0F))).getRGB() & -1996488705);
      class_1799 offHand = mc.field_1724.method_6079();
      if (!offHand.method_7960()) {
         RenderUtils.drawRoundedRect((double)(w / 2.0F + -132.0F), (double)(h - 22.0F), (double)(w / 2.0F + -110.0F), (double)h, 2.0D, ThemeManager.getPrimaryColor((double)(w / 2.0F + -132.0F)).getRGB() & -1996488705);
         GL11.glEnable(3553);
         mc.method_1480().method_4010(offHand, (int)(w / 2.0F + -132.0F) + 3, (int)(h - 22.0F + 3.0F));
         if (offHand.method_7947() > 1) {
            GL11.glPushMatrix();
            GL11.glTranslated((double)(w / 2.0F + -132.0F + 17.0F), (double)(h - 5.0F), 100.0D);
            GL11.glScaled(0.55D, 0.55D, 0.55D);
            GL11.glDisable(2929);
            GL11.glDisable(3008);
            Global.Harry.getGeneric().drawCenteredStringWithShadow(String.valueOf((new StringBuilder()).append(offHand.method_7947()).append("")), 0.0D, 0.0D, this.Oliver(true, (double)(w / 2.0F + -132.0F), this.Jack));
            GL11.glEnable(2929);
            GL11.glEnable(3008);
            GL11.glPopMatrix();
         }
      }

      int i = 0;

      do {
         if (i >= 9) {
            GL11.glEnable(3553);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            "".length();
            if ((142 + 99 - 61 + 16 ^ 10 + 99 - -70 + 13) > (117 ^ 72 ^ 135 ^ 190)) {
               return;
            }

            return;
         }

         class_1799 stack = mc.field_1724.field_7514.method_5438(i);
         GL11.glEnable(3553);
         mc.method_1480().method_4010(stack, (int)((double)(w / 2.0F) + 22.0D * ((double)i - 4.5D)) + 3, (int)(h - 22.0F + 3.0F));
         if (stack.method_7947() > 1) {
            GL11.glPushMatrix();
            GL11.glTranslated((double)(w / 2.0F + 22.0F * ((float)i - 4.5F) + 17.0F), (double)(h - 5.0F), 100.0D);
            GL11.glScaled(0.55D, 0.55D, 0.55D);
            GL11.glDisable(2929);
            GL11.glDisable(3008);
            TTFFontRenderer var10000 = Global.Harry.getGeneric();
            String var8 = String.valueOf((new StringBuilder()).append(stack.method_7947()).append(""));
            boolean var10005;
            if (i == mc.field_1724.field_7514.field_7545) {
               var10005 = true;
               "".length();
               if (-"  ".length() >= 0) {
                  return;
               }
            } else {
               var10005 = false;
            }

            var10000.drawCenteredStringWithShadow(var8, 0.0D, 0.0D, this.Oliver(var10005, (double)(w / 2.0F) + 22.0D * ((double)mc.field_1724.field_7514.field_7545 - 4.5D), this.Jack));
            GL11.glEnable(2929);
            GL11.glEnable(3008);
            GL11.glPopMatrix();
         }

         ++i;
         "".length();
      } while(-"   ".length() <= 0);

   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(HUDRenderListener.class, this);
      this.Jacob = new Animation();
      this.Charlie = new Animation();
      this.Thomas = new Animation();
      this.George = new Animation();
      this.Oscar = new Animation();
      this.James = new Animation();
      this.Harry = new Animation(8.0D);
      "".length();
      if (" ".length() >= "".length()) {
         ;
      }
   }

   public HUD() {
      super("HUD", "Modifies in game hud.", Category.Thomas);
      "".length();
      if ("  ".length() < 0) {
         throw null;
      }
   }

   private static int llIllIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int llIllIIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }
}
