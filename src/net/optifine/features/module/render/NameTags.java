package net.optifine.features.module.render;

import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.config.ColorPickerSetting;
import net.optifine.config.EnumSetting;
import net.optifine.config.Splitter;
import net.optifine.managers.event.events.NameTageRenderListener;
import net.optifine.managers.event.events.NameTageRenderListener.NameTagRenderEvent;
import net.optifine.managers.event.events.RenderListener;
import net.optifine.util.font.TTFFontRenderer;
import net.optifine.util.render.RenderUtils;
import net.optifine.util.theme.ThemeManager;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import org.lwjgl.opengl.GL11;

import java.util.*;
import java.util.Map.Entry;

public class NameTags extends Module implements NameTageRenderListener, RenderListener {
   // $FF: synthetic field
   private final EnumSetting< ColorMode> Harry;
   // $FF: synthetic field
   private final BooleanSetting Oscar;
   // $FF: synthetic field
   private final ArrayList<class_1297> James;
   // $FF: synthetic field
   private final BooleanSetting Charlie;
   // $FF: synthetic field
   private final BooleanSetting George;
   // $FF: synthetic field
   private final ColorPickerSetting Jacob;
   // $FF: synthetic field
   private final BooleanSetting Thomas;
   // $FF: synthetic field
   public static final ColorMode[] Jack = ColorMode.values();

   public void Oliver(float partialTicks) {
      if (this.George.Jack()) {
         this.James.add(mc.field_1724);
         "".length();
      }

      Iterator var2;
      class_1297 e;
      if (this.Thomas.Jack()) {
         List var10000;
         if (mc.field_1687 != null) {
            var10000 = mc.field_1687.method_18456();
            "".length();
            if ((153 ^ 157) != (124 ^ 120)) {
               return;
            }
         } else {
            var10000 = null;
         }

         var2 = ((List)Objects.requireNonNull(var10000)).iterator();

         while(var2.hasNext()) {
            e = (class_1297)var2.next();
            if (!this.James.contains(e) && e != mc.field_1724) {
               this.James.add(e);
               "".length();
            }

            "".length();
            if (" ".length() == "   ".length()) {
               return;
            }
         }
      }

      var2 = this.James.iterator();

      do {
         if (!var2.hasNext()) {
            this.James.clear();
            "".length();
            if (-(140 ^ 184 ^ 172 ^ 156) >= 0) {
               return;
            }

            return;
         }

         e = (class_1297)var2.next();
         class_4184 cam = mc.field_1773.method_19418();
         double x = cam.method_19326().method_10216() - (e.field_6038 + (e.method_23317() - e.field_6014) * (double)mc.method_1488());
         double y = e.field_5971 + (e.method_23318() - e.field_6036) * (double)mc.method_1488() - cam.method_19326().method_10214() + 0.4D + e.method_5829().method_17940();
         double z = cam.method_19326().method_10215() - (e.field_5989 + (e.method_23321() - e.field_5969) * (double)mc.method_1488());
         GL11.glPushMatrix();
         GL11.glDisable(3553);
         class_4493.method_22078();
         GL11.glDisable(2929);
         GL11.glEnable(3042);
         GL11.glShadeModel(7425);
         GL11.glBlendFunc(770, 771);
         GL11.glRotatef(cam.method_19329(), 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(cam.method_19330(), 0.0F, 1.0F, 0.0F);
         GL11.glTranslated(x, y, z);
         GL11.glRotatef(-cam.method_19330(), 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-cam.method_19329(), 1.0F, 0.0F, 0.0F);
         String name = e.method_5476().getString();
         double w = (double)(Global.Harry.getGeneric().getWidth(name) / 2.0F) * 0.015D + 0.06D;
         double h = (double)(Global.Harry.getGeneric().getHeight(name) / 2.0F) * 0.015D + 0.03D;
         GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.5F);
         GL11.glBegin(7);
         GL11.glVertex3d(-w, -h, 0.0D);
         GL11.glVertex3d(w, -h, 0.0D);
         GL11.glVertex3d(w, h, 0.0D);
         GL11.glVertex3d(-w, h, 0.0D);
         GL11.glEnd();
         GL11.glScaled(0.015D, -0.015D, -0.015D);
         if (e instanceof class_1657 && Global.Oscar().contains(e.method_5477().getString())) {
            Global.Harry.getGeneric().drawCenteredString(name, 0.0D, 0.0D, ThemeManager.getFriendColor().getRGB());
            "".length();
            if ("".length() <= -" ".length()) {
               return;
            }
         } else {
            TTFFontRenderer var28 = Global.Harry.getGeneric();
            int var10004;
            if (this.Harry.Harry() == ColorMode.Oliver) {
               var10004 = ThemeManager.getPrimaryColor().getRGB();
               "".length();
               if (" ".length() > (12 ^ 78 ^ 11 ^ 77)) {
                  return;
               }
            } else {
               var10004 = this.Jacob.Oscar().getRGB();
            }

            var28.drawCenteredString(name, 0.0D, 0.0D, var10004);
         }

         if (!(e instanceof class_1657)) {
            GL11.glPopMatrix();
            GL11.glEnable(2929);
            class_4493.method_22076();
         } else {
            class_1657 player = (class_1657)e;
            GL11.glScaled(0.5D, 0.5D, 0.5D);
            int i = 0;

            while(true) {
               if (i >= player.field_7514.field_7548.size()) {
                  GL11.glPopMatrix();
                  GL11.glEnable(2929);
                  class_4493.method_22076();
                  RenderUtils.drawGuiItem(e.field_6038 + (e.method_23317() - e.field_6014) * (double)mc.method_1488(), e.field_5971 + (e.method_23318() - e.field_6036) * (double)mc.method_1488() + 0.4D + e.method_5829().method_17940(), e.field_5989 + (e.method_23321() - e.field_5969) * (double)mc.method_1488(), -w - h - 0.02D, 0.0D, h * 2.0D, player.method_6047());
                  RenderUtils.drawGuiItem(e.field_6038 + (e.method_23317() - e.field_6014) * (double)mc.method_1488(), e.field_5971 + (e.method_23318() - e.field_6036) * (double)mc.method_1488() + 0.4D + e.method_5829().method_17940(), e.field_5989 + (e.method_23321() - e.field_5969) * (double)mc.method_1488(), w + h + 0.02D, 0.0D, h * 2.0D, player.method_6079());
                  RenderUtils.drawGuiItem(e.field_6038 + (e.method_23317() - e.field_6014) * (double)mc.method_1488(), e.field_5971 + (e.method_23318() - e.field_6036) * (double)mc.method_1488() + 0.4D + e.method_5829().method_17940(), e.field_5989 + (e.method_23321() - e.field_5969) * (double)mc.method_1488(), w - h - 0.04D, h * 2.0D + 0.02D, h * 2.0D, player.field_7514.method_7372(0));
                  this.Oliver(e, w, h, player, 3, 2, 1);
                  this.Oliver(e, w, h, player, 5, 3, 2);
                  this.Oliver(e, w, h, player, 7, 4, 3);
                  "".length();
                  if ("".length() > 0) {
                     return;
                  }
                  break;
               }

               class_1799 armor = (class_1799)player.field_7514.field_7548.get(i);
               int j = 0;
               Iterator var20 = class_1890.method_8222(armor).entrySet().iterator();

               while(var20.hasNext()) {
                  Entry<class_1887, Integer> en = (Entry)var20.next();
                  String ench = ((class_1887)en.getKey()).method_8179(1).getString();
                  int k = 0;
                  char[] var24 = ench.toLowerCase(Locale.ROOT).toCharArray();
                  int var25 = var24.length;
                  int var26 = 0;

                  while(var26 < var25) {
                     char c = var24[var26];
                     ++k;
                     if (k < 3) {
                        "".length();
                        if ("".length() > 0) {
                           return;
                        }
                     } else if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y' && c != 1072 && c != 1091 && c != 1086 && c != 1099 && c != 1080 && c != 1101 && c != 1103 && c != 1102 && c != 1105 && c != 1077) {
                        "".length();
                        if (-" ".length() > 0) {
                           return;
                        }
                        break;
                     }

                     ++var26;
                     "".length();
                     if (" ".length() < " ".length()) {
                        return;
                     }
                  }

                  ench = String.valueOf((new StringBuilder()).append(ench.substring(0, k)).append(" ").append(en.getValue()));
                  double h2 = (double)Global.Harry.getGeneric().getHeight(ench);
                  Global.Harry.getGeneric().drawString(ench, (-w + 0.04D * (double)(1 + i) + h * 2.0D * (double)i) / 0.015D * 2.0D, (-h * (double)(3 + j) - 0.02D * (double)(2 + j)) / 0.015D * 2.0D - h2, ThemeManager.getPrimaryColor((double)(i * 80)).getRGB());
                  "".length();
                  ++j;
                  "".length();
                  if ("   ".length() <= -" ".length()) {
                     return;
                  }
               }

               ++i;
               "".length();
               if (" ".length() <= 0) {
                  return;
               }
            }
         }

         "".length();
      } while((99 + 79 - 146 + 108 ^ 132 + 1 - 58 + 62) > 0);

   }

   private void Oliver(class_1297 e, double w, double h, class_1657 player, int i2, int i3, int i4) {
      RenderUtils.drawGuiItem(e.field_6038 + (e.method_23317() - e.field_6014) * (double)mc.method_1488(), e.field_5971 + (e.method_23318() - e.field_6036) * (double)mc.method_1488() + 0.4D + e.method_5829().method_17940(), e.field_5989 + (e.method_23321() - e.field_5969) * (double)mc.method_1488(), w - h * (double)i2 - 0.04D * (double)i3, h * 2.0D + 0.02D, h * 2.0D, player.field_7514.method_7372(i4));
      "".length();
      if (" ".length() != 0) {
         ;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(NameTageRenderListener.class, this);
      EVENT_MANAGER.Oliver(RenderListener.class, this);
      "".length();
      if ((165 + 76 - 100 + 33 ^ 71 + 169 - 209 + 139) >= " ".length()) {
         ;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(NameTageRenderListener.class, this);
      EVENT_MANAGER.Jack(RenderListener.class, this);
      "".length();
      if ("   ".length() != "".length()) {
         ;
      }
   }

   static {
      "".length();
      if ("   ".length() >= -" ".length()) {
         ;
      }
   }

   public void Oliver(NameTagRenderEvent event) {
      event.Oliver = false;
      if (this.Charlie.Jack() && event.Jack instanceof class_1531) {
         "".length();
         if ("".length() < 0) {
            return;
         }
      } else {
         if (!this.James.contains(event.Jack) && (event.Jack.method_5805() || this.Oscar.Jack())) {
            this.James.add(event.Jack);
            "".length();
         }

         "".length();
         if (" ".length() >= (24 ^ 4 ^ 221 ^ 197)) {
            return;
         }
      }

   }

   public NameTags() {
      super("NameTags", "Shows better name tags for entities!", Category.Harry);
      this.Harry = new EnumSetting("Color Mode", Jack, ColorMode.Oliver);
      this.Jacob = new ColorPickerSetting("Color");
      this.Charlie = new BooleanSetting("Hide armor stands", false);
      this.Thomas = new BooleanSetting("Show all players", false);
      this.George = new BooleanSetting("Show self", false);
      this.Oscar = new BooleanSetting("Show Dead", false);
      this.James = new ArrayList();
      this.addSetting(this.Charlie);
      this.addSetting(this.Thomas);
      this.addSetting(this.George);
      this.addSetting(this.Oscar);
      this.addSetting(new Splitter("Visual"));
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      "".length();
      if (" ".length() >= (43 ^ 30 ^ 94 ^ 111)) {
         throw null;
      }
   }

   private static enum ColorMode {
      // $FF: synthetic field
      private final String Harry;
      // $FF: synthetic field
      Oliver("Themed"),
      // $FF: synthetic field
      Jack("Static");

      static {
         "".length();
         if ("".length() != (55 ^ 51)) {
            ;
         }
      }

      public String toString() {
         String var1 = this.Harry;
         "".length();
         return -" ".length() >= (6 ^ 61 ^ 141 ^ 178) ? null : var1;
      }

      private ColorMode(String name) {
         this.Harry = name;
         "".length();
         if ("  ".length() < "  ".length()) {
            throw null;
         }
      }
   }
}
