package net.optifine.features.module.render;

import com.sun.javafx.geom.Vec2f;
import com.sun.javafx.geom.Vec3f;
import net.optifine.Global;
import net.optifine.config.*;
import net.optifine.managers.event.events.CameraTransformViewBobbingListener;
import net.optifine.managers.event.events.CameraTransformViewBobbingListener.CameraTransformViewBobbingEvent;
import net.optifine.managers.event.events.RenderListener;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.FakePlayerEntity;
import net.optifine.util.GeneralSettings.ColorMode;
import net.optifine.util.ProjectionUtil;
import net.optifine.util.RotationUtils;
import net.optifine.util.render.RenderUtils;
import net.optifine.util.render.Texture;
import net.optifine.util.theme.Theme;
import net.optifine.util.theme.ThemeManager;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ESP extends Module implements CameraTransformViewBobbingListener, RenderListener, UpdateListener {
   // $FF: synthetic field
   private final BooleanSetting Elizabeth;
   // $FF: synthetic field
   public static Texture Jack = new Texture("/assets/zamorozka/images/floyd.jpg");
   // $FF: synthetic field
   private final ArrayList<class_1297> OlIver;
   // $FF: synthetic field
   public static final Mode[] Charlie = Mode.values();
   // $FF: synthetic field
   private final BooleanSetting Sarah;
   // $FF: synthetic field
   public static final Style[] Jacob = Style.values();
   // $FF: synthetic field
   private final BooleanSetting Oscar;
   // $FF: synthetic field
   private int JaCk;
   // $FF: synthetic field
   private final NumberSetting Jennifer;
   // $FF: synthetic field
   private final ColorPickerSetting Patricia;
   // $FF: synthetic field
   private final BooleanSetting Margaret;
   // $FF: synthetic field
   private final BooleanSetting Jessica;
   // $FF: synthetic field
   public static final ColorMode[] Harry = ColorMode.values();
   // $FF: synthetic field
   private final BooleanSetting Linda;
   // $FF: synthetic field
   private final BooleanSetting Susan;
   // $FF: synthetic field
   private final BooleanSetting James;
   // $FF: synthetic field
   private final EnumSetting<ColorMode> Mary;
   // $FF: synthetic field
   private final EnumSetting< Mode> Thomas;
   // $FF: synthetic field
   private final EnumSetting< Style> George;
   // $FF: synthetic field
   private final BooleanSetting William;
   // $FF: synthetic field
   private final BooleanSetting Barbara;

   private static int lIIIIIIIlIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public void Oliver(float partialTicks) {
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDisable(2896);
      class_2338 camPos = RenderUtils.getCameraBlockPos();
      int regionX = (camPos.method_10263() >> 9) * 512;
      int regionZ = (camPos.method_10260() >> 9) * 512;
      if ( Mode.Jack(( Mode)this.Thomas.Harry())) {
         this.Oliver(partialTicks, regionX, regionZ);
      }

      if ( Mode.Oliver(( Mode)this.Thomas.Harry())) {
         this.Jack(partialTicks, regionX, regionZ);
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable(2929);
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   private void Oliver(class_1297 e, float partialTicks) {
      class_4184 cam = mc.field_1773.method_19418();
      GL11.glPushMatrix();
      GL11.glRotatef(cam.method_19329(), 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(cam.method_19330() - 180.0F, 0.0F, 1.0F, 0.0F);
      float[] mvMatrix = ProjectionUtil.getMatrix(2982);
      float[] projectionMatrix = ProjectionUtil.getMatrix(2983);
      GL11.glPopMatrix();
      class_238 bb = e.method_5829().method_989(-e.method_23317(), -e.method_23318(), -e.method_23321()).method_989(e.field_6038 + (e.method_23317() - e.field_6038) * (double)partialTicks, e.field_5971 + (e.method_23318() - e.field_5971) * (double)partialTicks, e.field_5989 + (e.method_23321() - e.field_5989) * (double)partialTicks).method_989(-cam.method_19326().field_1352, -cam.method_19326().field_1351, -cam.method_19326().field_1350);
      double[][] boxVertices = new double[][]{{bb.field_1323, bb.field_1322, bb.field_1321}, {bb.field_1323, bb.field_1325, bb.field_1321}, {bb.field_1320, bb.field_1325, bb.field_1321}, {bb.field_1320, bb.field_1322, bb.field_1321}, {bb.field_1323, bb.field_1322, bb.field_1324}, {bb.field_1323, bb.field_1325, bb.field_1324}, {bb.field_1320, bb.field_1325, bb.field_1324}, {bb.field_1320, bb.field_1322, bb.field_1324}};
      float minX = Float.MAX_VALUE;
      float minY = Float.MAX_VALUE;
      float maxX = Float.MIN_VALUE;
      float maxY = Float.MIN_VALUE;
      double[][] var12 = boxVertices;
      int var13 = boxVertices.length;
      int var14 = 0;

      while(var14 < var13) {
         double[] boxVertex = var12[var14];
         Vec2f screenPos = ProjectionUtil.pointToScreen(new Vec3f((float)boxVertex[0], (float)boxVertex[1], (float)boxVertex[2]), mvMatrix, projectionMatrix, mc.method_22683().method_4486(), mc.method_22683().method_4502());
         if (screenPos == null) {
            "".length();
            if ((127 ^ 123) != (48 ^ 52)) {
               return;
            }
         } else {
            minX = Math.min(screenPos.x, minX);
            minY = Math.min(screenPos.y, minY);
            maxX = Math.max(screenPos.x, maxX);
            maxY = Math.max(screenPos.y, maxY);
         }

         ++var14;
         "".length();
         if (-" ".length() >= "   ".length()) {
            return;
         }
      }

      if ((lIIIIIIIIIl(minX, 0.0F) > 0 || lIIIIIIIIIl(minY, 0.0F) > 0 || lIIIIIIIIlI(maxX, (float)mc.method_22683().method_4486()) <= 0 || lIIIIIIIIlI(maxY, (float)mc.method_22683().method_4502()) <= 0) && lIIIIIIIIll((double)maxX, 1.0E-5D) > 0 && lIIIIIIIIll((double)maxY, 1.0E-5D) > 0) {
         GL11.glPushAttrib(8192);
         GL11.glMatrixMode(5889);
         GL11.glPushMatrix();
         GL11.glLoadIdentity();
         GL11.glOrtho(0.0D, (double)mc.method_22683().method_4486(), (double)mc.method_22683().method_4502(), 0.0D, -1.0D, 1.0D);
         GL11.glMatrixMode(5888);
         GL11.glPushMatrix();
         GL11.glLoadIdentity();
         float w = (float)Math.min(10.0D, Math.hypot((double)(maxX - minX), (double)(maxX - minX)) / 50.0D);
         Color colBody = new Color(Theme.DARK.getColor().getRed(), Theme.DARK.getColor().getRed(), Theme.DARK.getColor().getRed(), 127);
         float radius = Math.min(maxX - minX, maxY - minY) / 10.0F;
         if (this.Oscar.Jack()) {
            if (this.George.Harry() == Style.Charlie) {
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               Jack.render((double)minX, (double)minY, (double)maxX, (double)maxY);
               "".length();
               if (-" ".length() >= "  ".length()) {
                  return;
               }
            } else if (this.James.Jack()) {
               RenderUtils.drawRoundedRectWithShadow((double)minX, (double)minY, (double)maxX, (double)maxY, (double)radius, colBody.getRGB(), 0.0D, 0.0D, 15.0D, colBody.getRGB());
               "".length();
               if ((190 ^ 186) < 0) {
                  return;
               }
            } else {
               GL11.glColor4f((float)colBody.getRed() / 255.0F, (float)colBody.getGreen() / 255.0F, (float)colBody.getBlue() / 255.0F, (float)colBody.getAlpha() / 255.0F);
               GL11.glBegin(7);
               GL11.glVertex2f(minX, minY);
               GL11.glVertex2f(minX, maxY);
               GL11.glVertex2f(maxX, maxY);
               GL11.glVertex2f(maxX, minY);
               GL11.glEnd();
            }
         }

         if (e instanceof class_1309) {
            class_1309 l = (class_1309)e;
            float h = 1.0F;
            float min = Math.min(minY + (maxY - minY) * h, maxY);
            if (lIIIIIIIIlI(Math.abs(minX - w * 2.0F - minX - w * 3.5F), 5.0F) < 0) {
               "".length();
               if ("   ".length() <= -" ".length()) {
                  return;
               }
            } else {
               if (this.William.Jack()) {
                  if (this.James.Jack()) {
                     RenderUtils.drawRoundedRectWithShadow((double)(minX - w * 3.5F), (double)minY, (double)(minX - w * 2.0F), (double)min, 0.0D, -1089400559, 0.0D, 0.0D, 2.0D, 1074860305);
                     "".length();
                     if (-" ".length() >= "  ".length()) {
                        return;
                     }
                  } else {
                     ThemeManager.useColor(Theme.DARK.getColor(), 0.75F);
                     GL11.glBegin(7);
                     GL11.glVertex2f(minX - w * 3.5F, minY);
                     GL11.glVertex2f(minX - w * 2.0F, minY);
                     GL11.glVertex2f(minX - w * 2.0F, min);
                     GL11.glVertex2f(minX - w * 3.5F, min);
                     GL11.glEnd();
                  }
               }

               h = Math.min(l.method_6032() / l.method_6063(), 1.0F);
               Color var10000;
               if (this.Mary.Harry() == ColorMode.THEME) {
                  var10000 = ThemeManager.getPrimaryColor();
                  "".length();
                  if ("  ".length() < "".length()) {
                     return;
                  }
               } else {
                  var10000 = this.Patricia.Oscar();
               }

               Color c = var10000;
               ThemeManager.useColor(c, 1.0F);
               boolean smooth = GL11.glIsEnabled(2881);
               GL11.glEnable(2881);
               GL11.glHint(3155, 4354);
               GL11.glBegin(7);
               float yMax = minY + (maxY - minY) * 0.005F + (maxY - minY) * (1.0F - h);
               GL11.glVertex2f(minX - w * 3.0F, yMax);
               GL11.glVertex2f(minX - w * 2.5F, yMax);
               if (this.Mary.Harry() == ColorMode.THEME) {
                  var10000 = ThemeManager.getPrimaryColor(500.0D);
                  "".length();
                  if (-(57 + 169 - 212 + 157 ^ 77 + 59 - -5 + 34) >= 0) {
                     return;
                  }
               } else {
                  var10000 = this.Patricia.Oscar();
               }

               c = var10000;
               ThemeManager.useColor(c, 1.0F);
               GL11.glVertex2f(minX - w * 2.5F, maxY - (maxY - minY) * 0.005F);
               GL11.glVertex2f(minX - w * 3.0F, maxY - (maxY - minY) * 0.005F);
               GL11.glEnd();
               if (!smooth) {
                  GL11.glDisable(2881);
               }
            }
         }

         GL11.glMatrixMode(5889);
         GL11.glPopMatrix();
         GL11.glMatrixMode(5888);
         GL11.glPopMatrix();
         GL11.glPopAttrib();
      }

      "".length();
      if ((63 ^ 75 ^ 72 ^ 56) == (60 + 59 - 103 + 146 ^ 72 + 122 - 122 + 94)) {
         ;
      }
   }

   private void Jack(float partialTicks, int regionX, int regionZ) {
      GL11.glPushMatrix();
      RenderUtils.applyRegionalRenderOffset();
      class_243 start = RotationUtils.getClientLookVec().method_1019(RenderUtils.getCameraPos());
      RenderUtils.setLineWidth(3.0F);
      GL11.glBegin(1);
      Iterator var5 = this.OlIver.iterator();

      do {
         if (!var5.hasNext()) {
            GL11.glEnd();
            GL11.glPopMatrix();
            "".length();
            if (-" ".length() != -" ".length()) {
               return;
            }

            return;
         }

         class_1297 e = (class_1297)var5.next();
         class_243 end = e.method_5829().method_1005().method_1020((new class_243(e.method_23317(), e.method_23318(), e.method_23321())).method_1023(e.field_6014, e.field_6036, e.field_5969).method_1021((double)(1.0F - partialTicks)));
         if (e instanceof class_745 && Global.Oscar().contains(e.method_5820())) {
            ThemeManager.useFriendColor(0.25F);
            "".length();
            if ((148 ^ 144) < " ".length()) {
               return;
            }
         } else {
            ThemeManager.usePrimaryColor(0.25F);
         }

         GL11.glVertex3d(start.field_1352 - (double)regionX, start.field_1351, start.field_1350 - (double)regionZ);
         GL11.glVertex3d(end.field_1352 - (double)regionX, end.field_1351, end.field_1350 - (double)regionZ);
         "".length();
      } while((32 ^ 36) > "".length());

   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      EVENT_MANAGER.Oliver(CameraTransformViewBobbingListener.class, this);
      EVENT_MANAGER.Oliver(RenderListener.class, this);
      this.JaCk = GL11.glGenLists(1);
      GL11.glNewList(this.JaCk, 4864);
      class_238 bb = new class_238(-0.5D, 0.0D, -0.5D, 0.5D, 1.0D, 0.5D);
      RenderUtils.drawSolidBox(bb);
      GL11.glEndList();
      "".length();
      if ((47 ^ 43) >= " ".length()) {
         ;
      }
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      EVENT_MANAGER.Jack(CameraTransformViewBobbingListener.class, this);
      EVENT_MANAGER.Jack(RenderListener.class, this);
      GL11.glDeleteLists(this.JaCk, 1);
      this.JaCk = 0;
      Iterator var1 = this.OlIver.iterator();

      do {
         if (!var1.hasNext()) {
            "".length();
            if (" ".length() >= (16 + 112 - 26 + 78 ^ 148 + 54 - 97 + 71)) {
               return;
            }

            return;
         }

         class_1297 e = (class_1297)var1.next();
         e.method_5834(false);
         "".length();
      } while(null == null);

   }

   public ESP() {
      super("ESP", "Allows you to see targets through walls.");
      this.Thomas = new EnumSetting("Mode", Charlie, Mode.Oliver);
      this.George = new EnumSetting("Style", Jacob, Style.Oliver);
      this.Oscar = new BooleanSetting("Draw Body", true);
      this.James = new BooleanSetting("Use Shader", true);
      this.William = new BooleanSetting("Outline For Health", true);
      this.Mary = new EnumSetting("Color Mode", Harry, ColorMode.THEME);
      this.Patricia = new ColorPickerSetting("Static Color", 0.0F, 0.0F, 100.0F);
      this.Jennifer = new NumberSetting("Box Opacity", 0.5D, 0.0D, 1.0D, 0.009999999776482582D);
      this.Elizabeth = new BooleanSetting("Draw players", true);
      this.Linda = new BooleanSetting("Draw monsters", false);
      this.Barbara = new BooleanSetting("Draw animals", false);
      this.Susan = new BooleanSetting("Draw pets", false);
      this.Margaret = new BooleanSetting("Draw items", false);
      this.Jessica = new BooleanSetting("Draw invisible", false);
      this.Sarah = new BooleanSetting("Draw dead", false);
      this.OlIver = new ArrayList();
      this.Oliver((Category)Category.Harry);
      this.addSetting(this.Thomas);
      this.addSetting(this.George);
      this.addSetting(new Splitter("2D ESP Settings"));
      this.addSetting(this.Oscar);
      this.addSetting(this.James);
      this.addSetting(this.William);
      this.addSetting(new Splitter("Color Settings"));
      this.addSetting(this.Mary);
      this.addSetting(this.Patricia);
      this.addSetting(this.Jennifer);
      this.addSetting(new Splitter("Targets", "With next settings you can choose entities for esp."));
      this.addSetting(this.Elizabeth);
      this.addSetting(this.Linda);
      this.addSetting(this.Barbara);
      this.addSetting(this.Susan);
      this.addSetting(this.Margaret);
      this.addSetting(this.Jessica);
      this.addSetting(this.Sarah);
      "".length();
      if ("  ".length() < -" ".length()) {
         throw null;
      }
   }

   private static int lIIIIIIIIIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static int lIIIIIIIIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public void Oliver(CameraTransformViewBobbingEvent event) {
      if ( Mode.Oliver(( Mode)this.Thomas.Harry())) {
         event.Oliver();
      }

      "".length();
      if ("   ".length() >= 0) {
         ;
      }
   }

   static {
      "".length();
      if ("   ".length() >= 0) {
         ;
      }
   }

   private static int lIIIIIIIIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private void Oliver(float partialTicks, int regionX, int regionZ) {
      RenderUtils.setLineWidth(20.0F);
      GL11.glDisable(3553);
      class_4493.method_22078();
      GL11.glDisable(2929);
      GL11.glEnable(3042);
      GL11.glShadeModel(7425);
      GL11.glBlendFunc(770, 771);
      Iterator var4 = this.OlIver.iterator();

      do {
         if (!var4.hasNext()) {
            "".length();
            if (null != null) {
               return;
            }

            return;
         }

         class_1297 e = (class_1297)var4.next();
         if (this.George.Harry() == Style.Jack) {
            e.method_5834(true);
         }

         if (this.Mary.Harry() == ColorMode.THEME) {
            if (e instanceof class_745 && Global.Oscar().contains(e.method_5820())) {
               ThemeManager.useFriendColor(this.Jennifer.George());
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               ThemeManager.usePrimaryColor(this.Jennifer.George());
               "".length();
               if ("".length() >= "  ".length()) {
                  return;
               }
            }
         } else {
            ThemeManager.useColor(this.Patricia.Oscar(), this.Jennifer.George());
         }

         GL11.glPushMatrix();
         if (this.George.Harry() == Style.Oliver || this.George.Harry() == Style.Jacob) {
            RenderUtils.applyRegionalRenderOffset();
            GL11.glTranslated(e.field_6014 + (e.method_23317() - e.field_6014) * (double)partialTicks - (double)regionX, e.field_6036 + (e.method_23318() - e.field_6036) * (double)partialTicks, e.field_5969 + (e.method_23321() - e.field_5969) * (double)partialTicks - (double)regionZ);
            GL11.glScaled((double)e.method_17681(), (double)e.method_17682(), (double)e.method_17681());
            GL11.glCallList(this.JaCk);
         }

         GL11.glPopMatrix();
         GL11.glPushMatrix();
         if (this.George.Harry() == Style.Harry || this.George.Harry() == Style.Jacob || this.George.Harry() == Style.Charlie) {
            this.Oliver(e, partialTicks);
         }

         GL11.glPopMatrix();
         "".length();
      } while("".length() < "   ".length());

   }

   public void Thomas() {
      this.OlIver.clear();
      Stream<class_1297> stream = StreamSupport.stream(mc.field_1687.method_18112().spliterator(), true).filter((e) -> {
         byte var10000;
         if (!e.field_5988) {
            var10000 = 1;
            "".length();
            if (" ".length() == 0) {
               return (boolean)"".length();
            }
         } else {
            var10000 = 0;
         }

         byte var1 = var10000;
         "".length();
         return (boolean)((116 ^ 112) <= 0 ? "".length() : var1);
      }).filter((e) -> {
         byte var10000;
         if ((!(e instanceof class_1309) || lIIIIIIIlIl(((class_1309)e).method_6032(), 0.0F) <= 0 && !this.Sarah.Jack()) && (!(e instanceof class_1542) || !this.Margaret.Jack())) {
            var10000 = 0;
         } else {
            var10000 = 1;
            "".length();
            if ((63 ^ 127 ^ 36 ^ 96) < -" ".length()) {
               return (boolean)"".length();
            }
         }

         byte var2 = var10000;
         "".length();
         return (boolean)(null != null ? "".length() : var2);
      }).filter((e) -> {
         byte var10000;
         if (!(e instanceof class_1646)) {
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
         return (boolean)(-(43 ^ 1 ^ 75 ^ 101) >= 0 ? "".length() : var1);
      }).filter((e) -> {
         byte var10000;
         if (e != mc.field_1724) {
            var10000 = 1;
            "".length();
            if ("   ".length() <= 0) {
               return (boolean)"".length();
            }
         } else {
            var10000 = 0;
         }

         byte var1 = var10000;
         "".length();
         return (boolean)(-"   ".length() >= 0 ? "".length() : var1);
      }).filter((e) -> {
         byte var10000;
         if (!(e instanceof FakePlayerEntity)) {
            var10000 = 1;
            "".length();
            if (" ".length() != " ".length()) {
               return (boolean)"".length();
            }
         } else {
            var10000 = 0;
         }

         byte var1 = var10000;
         "".length();
         return (boolean)("   ".length() < 0 ? "".length() : var1);
      });
      if (!this.Elizabeth.Jack()) {
         stream = stream.filter((e) -> {
            byte var10000;
            if (!(e instanceof class_1657)) {
               var10000 = 1;
               "".length();
               if ((187 ^ 190) == 0) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = 0;
            }

            byte var1 = var10000;
            "".length();
            return (boolean)("   ".length() < 0 ? "".length() : var1);
         });
      }

      if (!this.Linda.Jack()) {
         stream = stream.filter((e) -> {
            byte var10000;
            if (!(e instanceof class_1569)) {
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
            return (boolean)("   ".length() < "  ".length() ? "".length() : var1);
         });
      }

      if (!this.Barbara.Jack()) {
         stream = stream.filter((e) -> {
            byte var10000;
            if (!(e instanceof class_1429) && !(e instanceof class_1421) && !(e instanceof class_1480)) {
               var10000 = 1;
               "".length();
               if ("".length() > 0) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = 0;
            }

            byte var1 = var10000;
            "".length();
            return (boolean)("  ".length() == 0 ? "".length() : var1);
         });
      }

      if (!this.Susan.Jack()) {
         stream = stream.filter((e) -> {
            byte var10000;
            if (e instanceof class_1321 && ((class_1321)e).method_6181()) {
               var10000 = 0;
            } else {
               var10000 = 1;
               "".length();
               if ("".length() < -" ".length()) {
                  return (boolean)"".length();
               }
            }

            byte var1 = var10000;
            "".length();
            return (boolean)(-" ".length() >= "".length() ? "".length() : var1);
         }).filter((e) -> {
            byte var10000;
            if (e instanceof class_1496 && ((class_1496)e).method_6727()) {
               var10000 = 0;
            } else {
               var10000 = 1;
               "".length();
               if ("".length() != 0) {
                  return (boolean)"".length();
               }
            }

            byte var1 = var10000;
            "".length();
            return (boolean)("   ".length() <= 0 ? "".length() : var1);
         });
      }

      if (!this.Jessica.Jack()) {
         stream = stream.filter((e) -> {
            byte var10000;
            if (!e.method_5767()) {
               var10000 = 1;
               "".length();
               if ((14 + 130 - 63 + 100 ^ 72 + 135 - 103 + 73) < 0) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = 0;
            }

            byte var1 = var10000;
            "".length();
            return (boolean)(null != null ? "".length() : var1);
         });
      }

      this.OlIver.addAll((Collection)stream.collect(Collectors.toList()));
      "".length();
      "".length();
      if (" ".length() > -" ".length()) {
         ;
      }
   }

   private static enum Style {
      // $FF: synthetic field
      Oliver("Box"),
      // $FF: synthetic field
      Harry("2D"),
      // $FF: synthetic field
      Charlie("Floyd"),
      // $FF: synthetic field
      Jack("MC-Glow"),
      // $FF: synthetic field
      Jacob("Box w2D");

      // $FF: synthetic field
      private final String Thomas;

      static {
         "".length();
         if (null == null) {
            ;
         }
      }

      public String toString() {
         String var1 = this.Thomas;
         "".length();
         return (162 ^ 167) == 0 ? null : var1;
      }

      private Style(String name) {
         this.Thomas = name;
         "".length();
         if (-" ".length() >= "  ".length()) {
            throw null;
         }
      }
   }

   private static enum Mode {
      // $FF: synthetic field
      private final String Jacob;
      // $FF: synthetic field
      Jack("Tracers", false, true),
      // $FF: synthetic field
      Oliver("Styled", true, false);

      // $FF: synthetic field
      private final boolean Thomas;
      // $FF: synthetic field
      private final boolean Charlie;
      // $FF: synthetic field
      Harry("Both", true, true);

      // $FF: synthetic method
      static boolean Oliver( Mode x0) {
         byte var1 = x0.Thomas;
         "".length();
         return (boolean)((23 ^ 19) <= -" ".length() ? "".length() : var1);
      }

      static {
         "".length();
         if (null == null) {
            ;
         }
      }

      private Mode(String name, boolean boxes, boolean lines) {
         this.Jacob = name;
         this.Charlie = boxes;
         this.Thomas = lines;
         "".length();
         if ("  ".length() < 0) {
            throw null;
         }
      }

      // $FF: synthetic method
      static boolean Jack( Mode x0) {
         byte var1 = x0.Charlie;
         "".length();
         return (boolean)("".length() > "   ".length() ? "".length() : var1);
      }

      public String toString() {
         String var1 = this.Jacob;
         "".length();
         return " ".length() <= 0 ? null : var1;
      }
   }
}
