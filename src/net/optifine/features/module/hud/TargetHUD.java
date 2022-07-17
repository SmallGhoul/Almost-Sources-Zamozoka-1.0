package net.optifine.features.module.hud;

import net.optifine.Global;
import net.optifine.config.*;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.NameTageRenderListener;
import net.optifine.managers.event.events.NameTageRenderListener.NameTagRenderEvent;
import net.optifine.managers.event.events.Render2DListener;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.font.TTFFontRenderer;
import net.optifine.util.math.MathUtils;
import net.optifine.util.render.RenderUtils;
import net.optifine.util.theme.ThemeManager;
import net.optifine.util.theme.ThemeManager.ThemeHelper;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class TargetHUD extends Module implements NameTageRenderListener, Render2DListener, UpdateListener {
   // $FF: synthetic field
   float William;
   // $FF: synthetic field
   ArrayList<Double> George;
   // $FF: synthetic field
   EnumSetting< TargetHUDMode> Jack;
   // $FF: synthetic field
   BooleanSetting Thomas;
   // $FF: synthetic field
   double Mary;
   // $FF: synthetic field
   double Patricia;
   // $FF: synthetic field
   class_1297 Oscar;
   // $FF: synthetic field
   float James;
   // $FF: synthetic field
   BooleanSetting Charlie;
   // $FF: synthetic field
   DoubleSliderSetting Harry;
   // $FF: synthetic field
   NumberSetting Jacob;

   public void onRender2D(class_4587 matrixStack, float partialTicks) {
      boolean var10000;
      if (Global.Jack().JacoB.isEnabled() && Global.Jack().JacoB.Jennifer() != null) {
         var10000 = true;
         "".length();
         if (" ".length() == 0) {
            return;
         }
      } else {
         var10000 = false;
      }

      boolean b = var10000;
      class_1297 var59;
      if (Global.Jack().JacoB.isEnabled() && Global.Jack().JacoB.Jennifer() != null) {
         var59 = Global.Jack().JacoB.Jennifer();
         "".length();
         if (-"  ".length() >= 0) {
            return;
         }
      } else {
         var59 = this.Oscar;
      }

      class_1297 entity = var59;
      if (entity != null) {
         this.Oscar = entity;
      }

      double var10001 = this.Mary;
      double var10002;
      if (entity != null && b) {
         var10002 = 0.0D;
         "".length();
         if (" ".length() == -" ".length()) {
            return;
         }
      } else {
         var10002 = ((double)mc.method_22683().method_4486() - (double)mc.method_22683().method_4486() * this.Harry.Oscar()) * 1.3D;
      }

      this.Mary = var10001 + (var10002 - this.Mary) * Math.pow((double)mc.method_1534() / 50.0D, 0.5D);
      var10001 = this.Patricia;
      if (entity != null && b) {
         var10002 = 0.0D;
         "".length();
         if ("".length() < 0) {
            return;
         }
      } else {
         var10002 = ((double)mc.method_22683().method_4502() - (double)mc.method_22683().method_4502() * this.Harry.James()) * 1.3D / 2.0D;
      }

      this.Patricia = var10001 + (var10002 - this.Patricia) * Math.pow((double)mc.method_1534() / 50.0D, 0.5D);
      if (lllIIIIIlI(Math.abs(this.Mary - (double)mc.method_22683().method_4486()), 1.0D) < 0) {
         "".length();
         if ("   ".length() > "   ".length()) {
            return;
         }
      } else if (!(entity instanceof class_1309)) {
         "".length();
         if (null != null) {
            return;
         }
      } else {
         class_1309 livingEntity = (class_1309)entity;
         class_640 targetInfo = Global.Oliver.method_1562().method_2871(entity.method_5667());
         float targetHealth = livingEntity.method_6032();
         float targetMaxHealth = livingEntity.method_6063();
         String resultText = "Winning!";
         Color resultColor = ThemeManager.getPrimaryColor();
         float mcWidth = (float)mc.method_22683().method_4486();
         float mcHeight = (float)mc.method_22683().method_4502();
         float frameTime = mc.method_1534();
         float playerHealth = Global.Oliver.field_1724.method_6032();
         if (lllIIIIIll(playerHealth - targetHealth, 0.0F) > 0) {
            "".length();
            if (null != null) {
               return;
            }
         } else if (lllIIIIlII(playerHealth - targetHealth, -2.0F) < 0) {
            resultText = "Losing.";
            resultColor = ThemeHelper.getFontColor();
            "".length();
            if ("   ".length() <= -" ".length()) {
               return;
            }
         } else {
            resultText = "The odds are equal.";
            resultColor = ThemeHelper.getSelectedColor();
         }

         double height;
         double y2;
         double y1;
         double x1;
         double x2;
         Color c;
         Color cA;
         float targetPos;
         float pos;
         float posOpacity;
         Color col;
         TTFFontRenderer font;
         String ping;
         String name;
         String title;
         double width;
         String var60;
         switch(( TargetHUDMode)this.Jack.Harry()) {
         case Jack:
            GL11.glDisable(3553);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            width = 135.0D;
            height = 50.0D;
            y2 = (double)mcHeight * this.Harry.James() + this.Patricia;
            y1 = y2 - height;
            x1 = (double)mcWidth * this.Harry.Oscar() + this.Mary;
            x2 = x1 + width;
            c = new Color(-16119286, true);
            cA = new Color(-1459420413, true);
            targetPos = (float)((double)((float)Oliver(targetHealth, targetMaxHealth) / 100.0F) * (x2 - 3.0D - x1 + 3.0D));
            pos = (float)((double)this.James + (double)(targetPos - this.James) * Math.pow((double)frameTime / 150.0D, 0.5D));
            posOpacity = (float)((double)this.William + (double)(targetPos - this.William) * Math.pow((double)frameTime / 500.0D, 0.5D));
            this.James = (float)MathUtils.clamp(10.0D, (double)pos, x2 - x1);
            this.William = (float)MathUtils.clamp(10.0D, (double)posOpacity, x2 - x1);
            col = ThemeManager.getPrimaryColor();
            RenderUtils.drawRoundedRectWithShadow(x1, y1, x2, y2 + 3.0D, 0.0D, c.getRGB(), 0.0D, 0.0D, 15.0D, cA.getRGB());
            RenderUtils.drawRoundedRect(x1 + 3.0D, y1 + 3.0D, x1 + width / 4.0D - 3.0D, y2 - 9.0D, 3.0D, c.getRGB());
            RenderUtils.drawRoundedRect(x1 + 3.0D, y2 - 5.0D, x2 - 3.0D, y2 - 1.0D, 2.0D, c.getRGB());
            RenderUtils.drawRoundedRectWithShadow(x1 + 3.0D, y2 - 5.0D, x1 + (double)this.James - 3.0D, y2 - 1.0D, 0.0D, col.getRGB(), 0.0D, 0.0D, 15.0D, (new Color(col.getRed(), col.getGreen(), col.getBlue(), 25)).getRGB());
            RenderUtils.drawRoundedRect(x1 + 3.0D, y2 - 5.0D, x1 + (double)this.William - 3.0D, y2 - 1.0D, 0.0D, (new Color(col.getRed(), col.getGreen(), col.getBlue(), 102)).getRGB());
            GL11.glDisable(3008);
            font = Global.Harry.getSmallMain();
            if (targetInfo != null) {
               var60 = String.valueOf((new StringBuilder()).append(targetInfo.method_2959()).append(" ms"));
               "".length();
               if ((225 ^ 190 ^ 107 ^ 48) <= "".length()) {
                  return;
               }
            } else {
               var60 = "";
            }

            ping = var60;
            name = livingEntity.method_5477().getString();
            if (name.isEmpty()) {
               name = livingEntity.method_5820();
            }

            title = String.valueOf((new StringBuilder()).append(name).append("§7 ").append(ping));
            font.drawString(title, x1 + width / 4.0D, y1 + 4.0D, ThemeManager.getPrimaryColor().getRGB());
            "".length();
            font.drawString(String.valueOf((new StringBuilder()).append("§7Health: ").append(Oliver((double)targetHealth, 1)).append(" / ").append(Oliver((double)targetMaxHealth, 1))), x1 + width / 4.0D, y1 + 5.0D + (double)font.getHeight(title), ThemeManager.getPrimaryColor().getRGB());
            "".length();
            font.drawString(String.valueOf((new StringBuilder()).append("§7Distance: ").append(Oliver((double)livingEntity.method_5739(mc.field_1724), 2))), x1 + width / 4.0D, y1 + 5.0D + (double)(font.getHeight(title) * 2.0F), ThemeManager.getPrimaryColor().getRGB());
            "".length();
            livingEntity.method_5880(false);
            class_490.method_2486((int)((double)((int)x1) + width / 4.0D - width / 8.0D) + 2, (int)y2 - 10, 18, 0.0F, 0.0F, livingEntity);
            if (this.Thomas.Jack() && livingEntity.method_6079().method_7909() != class_1802.field_8162) {
               GL11.glPushMatrix();
               RenderUtils.drawRoundedRectWithShadow(x2 + 10.0D, y1 + 5.0D, x2 + 10.0D + 16.0D, y1 + 5.0D + 16.0D, 3.0D, c.getRGB(), 0.0D, 0.0D, 15.0D, c.getRGB());
               GL11.glEnable(3553);
               mc.method_1480().method_4010(livingEntity.method_6079(), (int)(x2 + 10.0D), (int)(y1 + 5.0D));
               GL11.glDisable(3553);
               Global.Harry.getSmallMain().drawCenteredString(String.valueOf((new StringBuilder()).append(livingEntity.method_6079().method_7947()).append("")), x2 + 23.0D, y1 + 5.0D + 12.0D, 1048575);
               GL11.glPopMatrix();
               "".length();
               if ((90 + 120 - 208 + 158 ^ 26 + 95 - 3 + 46) != (105 + 65 - 109 + 91 ^ 129 + 136 - 169 + 60)) {
                  return;
               }
            }
            break;
         default:
            GL11.glDisable(3553);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            width = 160.0D;
            height = 50.0D;
            y2 = (double)mcHeight * this.Harry.James() + this.Patricia;
            y1 = y2 - height;
            x1 = (double)mcWidth * this.Harry.Oscar() + this.Mary;
            x2 = x1 + width;
            c = new Color(822083584, true);
            cA = new Color(-1811939328, true);
            targetPos = (float)((double)((float)Oliver(targetHealth, targetMaxHealth) / 100.0F) * (x2 - 3.0D - x1 + 3.0D));
            pos = (float)((double)this.James + (double)(targetPos - this.James) * Math.pow((double)frameTime / 150.0D, 0.5D));
            posOpacity = (float)((double)this.William + (double)(targetPos - this.William) * Math.pow((double)frameTime / 500.0D, 0.5D));
            this.James = (float)MathUtils.clamp(10.0D, (double)pos, x2 - x1);
            this.William = (float)MathUtils.clamp(10.0D, (double)posOpacity, x2 - x1);
            col = ThemeManager.getPrimaryColor();
            RenderUtils.drawRoundedRectWithShadow(x1, y1, x2, y2 + 3.0D, 3.0D, c.getRGB(), 0.0D, 0.0D, 15.0D, cA.getRGB());
            RenderUtils.drawRoundedRect(x1 + 3.0D, y1 + 3.0D, x1 + width / 4.0D - 3.0D, y2 - 9.0D, 3.0D, c.getRGB());
            RenderUtils.drawRoundedRect(x1 + 3.0D, y2 - 5.0D, x2 - 3.0D, y2 - 1.0D, 2.0D, c.getRGB());
            RenderUtils.drawRoundedRectWithShadow(x1 + 3.0D, y2 - 5.0D, x1 + (double)this.James - 3.0D, y2 - 1.0D, 2.0D, col.getRGB(), 0.0D, 0.0D, 15.0D, (new Color(col.getRed(), col.getGreen(), col.getBlue(), 63)).getRGB());
            RenderUtils.drawRoundedRect(x1 + 3.0D, y2 - 5.0D, x1 + (double)this.William - 3.0D, y2 - 1.0D, 2.0D, (new Color(col.getRed(), col.getGreen(), col.getBlue(), 102)).getRGB());
            GL11.glDisable(3008);
            font = Global.Harry.getSmallMain();
            if (targetInfo != null) {
               var60 = String.valueOf((new StringBuilder()).append(targetInfo.method_2959()).append(" ms"));
               "".length();
               if ("".length() > " ".length()) {
                  return;
               }
            } else {
               var60 = "";
            }

            ping = var60;
            name = livingEntity.method_5477().getString();
            if (name.isEmpty()) {
               name = livingEntity.method_5820();
            }

            title = String.valueOf((new StringBuilder()).append(name).append("§7 ").append(ping));
            RenderUtils.drawRoundedRect(x1 + width / 4.0D, y1 + 3.0D, x2 - 3.0D, y1 + 2.0D + (double)font.getHeight(title), 3.0D, c.getRGB());
            font.drawCenteredString(title, x1 + (x2 - 3.0D - x1 + width / 4.0D) / 2.0D, y1 + (double)font.getHeight(title) / 1.25D, ThemeManager.getPrimaryColor().getRGB());
            if (!this.Charlie.Jack()) {
               font.drawString(String.valueOf((new StringBuilder()).append("§7Health: ").append(Oliver((double)targetHealth, 1)).append(" / ").append(Oliver((double)targetMaxHealth, 1))), x1 + width / 4.0D, y1 + 5.0D + (double)font.getHeight(title), ThemeManager.getPrimaryColor().getRGB());
               "".length();
               font.drawString(String.valueOf((new StringBuilder()).append("§7Distance: ").append(Oliver((double)livingEntity.method_5739(mc.field_1724), 2))), x1 + width / 4.0D, y1 + 5.0D + (double)(font.getHeight(title) * 2.0F), ThemeManager.getPrimaryColor().getRGB());
               "".length();
               "".length();
               if ("  ".length() > (34 ^ 38)) {
                  return;
               }
            } else if (!this.George.isEmpty()) {
               GL11.glEnable(2848);
               GL11.glEnable(3042);
               double x3 = x1 + width / 4.0D;
               double x4 = x2 - 3.0D;
               double graphWidth = x4 - x3;
               double y = y2 - 9.0D - (y1 + 4.0D + (double)font.getHeight(title));
               RenderUtils.drawRoundedRect(x3, y1 + 4.0D + (double)font.getHeight(title), x4, y2 - 9.0D, 2.0D, c.getRGB());
               int iter = 0;
               double lastY = -69.0D;
               double lastX = -69.0D;
               RenderUtils.setLineWidth(2.0F);
               double y3 = 0.0D;
               Iterator var53 = this.George.iterator();

               while(var53.hasNext()) {
                  double i = (Double)var53.next();
                  double diff = y * i;
                  double xPos = x3 + graphWidth / (double)this.George.size() * (double)iter;
                  y3 = y2 - 9.0D - diff;
                  ThemeManager.usePrimaryColor(1.0F, (double)(iter * 12));
                  GL11.glBegin(1);
                  double var61;
                  if (lllIIIIlIl(lastX, -69.0D) == 0) {
                     var61 = x3;
                     "".length();
                     if (null != null) {
                        return;
                     }
                  } else {
                     var61 = lastX;
                  }

                  if (lllIIIIlIl(lastY, -69.0D) == 0) {
                     var10001 = y3;
                     "".length();
                     if (null != null) {
                        return;
                     }
                  } else {
                     var10001 = lastY;
                  }

                  GL11.glVertex2d(var61, var10001);
                  GL11.glVertex2d(xPos, y3);
                  GL11.glEnd();
                  ++iter;
                  lastX = xPos;
                  lastY = y3;
                  if (iter == this.George.size()) {
                     GL11.glBegin(1);
                     GL11.glVertex2d(xPos, y3);
                  }

                  "".length();
                  if (-" ".length() == "".length()) {
                     return;
                  }
               }

               GL11.glVertex2d(x3 + graphWidth, y3);
               GL11.glEnd();
               GL11.glDisable(2848);
            }

            livingEntity.method_5880(false);
            class_490.method_2486((int)((double)((int)x1) + width / 4.0D - width / 8.0D), (int)y2 - 10, 18, 0.0F, 0.0F, livingEntity);
            if (this.Thomas.Jack() && livingEntity.method_6079().method_7909() != class_1802.field_8162) {
               GL11.glPushMatrix();
               RenderUtils.drawRoundedRectWithShadow(x2 + 10.0D, y1 + 5.0D, x2 + 10.0D + 16.0D, y1 + 5.0D + 16.0D, 3.0D, c.getRGB(), 0.0D, 0.0D, 15.0D, c.getRGB());
               GL11.glEnable(3553);
               mc.method_1480().method_4010(livingEntity.method_6079(), (int)(x2 + 10.0D), (int)(y1 + 5.0D));
               GL11.glDisable(3553);
               Global.Harry.getSmallMain().drawCenteredString(String.valueOf((new StringBuilder()).append(livingEntity.method_6079().method_7947()).append("")), x2 + 23.0D, y1 + 5.0D + 12.0D, 1048575);
               GL11.glPopMatrix();
            }
         }

         "".length();
         if ((51 ^ 22 ^ 113 ^ 81) <= 0) {
            return;
         }
      }

   }

   public void Thomas() {
      if (Global.Jack().JacoB.isEnabled()) {
         class_1309 entity = (class_1309)Global.Jack().JacoB.Jennifer();
         if (entity == null) {
            this.George.clear();
            "".length();
            if ((251 ^ 136 ^ 93 ^ 43) <= 0) {
               return;
            }

            return;
         }

         if (entity.method_5628() == this.Oscar.method_5628()) {
            if (this.George.size() > this.Jacob.Oscar()) {
               this.George.remove(0);
               "".length();
            }

            this.George.add(Math.min(1.0D, (double)(entity.method_6032() / entity.method_6063())));
            "".length();
            "".length();
            if (" ".length() <= 0) {
               return;
            }
         } else {
            this.George.clear();
         }
      }

      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   private static int lllIIIIlII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public void Oliver(NameTagRenderEvent event) {
      if (Global.Jack().JacoB.isEnabled()) {
         class_1297 entity = Global.Jack().JacoB.Jennifer();
         if (entity != null && event.Jack.method_5628() == entity.method_5628()) {
            event.Oliver = false;
         }
      }

      "".length();
      if ("  ".length() == "  ".length()) {
         ;
      }
   }

   private static int Oliver(float num, float total) {
      int var2 = (int)Math.min(num / total * 100.0F, 100.0F);
      "".length();
      return null != null ? "".length() : var2;
   }

   public TargetHUD() {
      super("TargetHUD", "Shows a special HUD for target what can show info like HP, saturation, distance etc.", Category.Thomas);
      this.Jack = new EnumSetting("Mode", TargetHUDMode.values(), TargetHUDMode.Oliver);
      this.Harry = new DoubleSliderSetting("Position", 0.625D, 0.76D);
      this.Jacob = new NumberSetting("Health Graph Length", "Length of graph (in ticks)", 20.0D, 1.0D, 100.0D, 1.0D, ValueDisplay.Jack);
      this.Charlie = new BooleanSetting("IsGraph", "Will show the enemy's HP in the form of a graph. Also, according to this graph, you can predict the bitcoin cost.", false);
      this.Thomas = new BooleanSetting("Show Item", false);
      this.George = new ArrayList();
      this.Oscar = null;
      this.James = 0.0F;
      this.William = 0.0F;
      this.Mary = (double)mc.method_22683().method_4486();
      this.Patricia = (double)mc.method_22683().method_4486();
      this.addSetting(new Splitter("General Settings"));
      this.addSetting(this.Jack);
      this.addSetting(this.Harry);
      this.addSetting(new Splitter("Transparent TargetHUD Settings"));
      this.addSetting(this.Charlie);
      this.addSetting(this.Jacob);
      this.addSetting(this.Thomas);
      "".length();
      if (null != null) {
         throw null;
      }
   }

   private static double Oliver(double val, int precision) {
      double val1 = Math.pow(10.0D, (double)precision);
      double var4 = (double)((int)(val * val1)) / val1;
      "".length();
      return "".length() != 0 ? 0.0D : var4;
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(Render2DListener.class, this);
      EVENT_MANAGER.Oliver(NameTageRenderListener.class, this);
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if ("".length() < (51 ^ 55)) {
         ;
      }
   }

   private static int lllIIIIlIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   static {
      "".length();
      if (-(133 + 39 - 161 + 172 ^ 37 + 27 - 18 + 133) <= 0) {
         ;
      }
   }

   private static int lllIIIIIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(Render2DListener.class, this);
      EVENT_MANAGER.Jack(NameTageRenderListener.class, this);
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if (-" ".length() < "   ".length()) {
         ;
      }
   }

   private static int lllIIIIIll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public static enum TargetHUDMode {
      // $FF: synthetic field
      private final String Harry;
      // $FF: synthetic field
      Jack("Unique"),
      // $FF: synthetic field
      Oliver("Transparent");

      static {
         "".length();
         if ("".length() >= 0) {
            ;
         }
      }

      public String toString() {
         String var1 = this.Harry;
         "".length();
         return "".length() != 0 ? null : var1;
      }

      private TargetHUDMode(String name) {
         this.Harry = name;
         "".length();
         if ((167 ^ 163) < 0) {
            throw null;
         }
      }
   }
}
