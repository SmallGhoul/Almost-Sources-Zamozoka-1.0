package net.optifine.features.module.render;

import net.optifine.config.EnumSetting;
import net.optifine.managers.event.events.CameraTransformViewBobbingListener;
import net.optifine.managers.event.events.CameraTransformViewBobbingListener.CameraTransformViewBobbingEvent;
import net.optifine.managers.event.events.RenderListener;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.BlockUtils;
import net.optifine.util.RotationUtils;
import net.optifine.util.render.RenderUtils;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.Iterator;

public class ChestEsp extends Module implements CameraTransformViewBobbingListener, UpdateListener, RenderListener {
   // $FF: synthetic field
   private int William;
   // $FF: synthetic field
   private final EnumSetting< Style> Harry;
   // $FF: synthetic field
   private final ArrayList<class_1297> George;
   // $FF: synthetic field
   private int Mary;
   // $FF: synthetic field
   private final ArrayList<class_238> Jacob;
   // $FF: synthetic field
   private int James;
   // $FF: synthetic field
   private final ArrayList<class_238> Thomas;
   // $FF: synthetic field
   private int Oscar;
   // $FF: synthetic field
   public static final Style[] Jack = Style.values();
   // $FF: synthetic field
   private final ArrayList<class_238> Charlie;

   public ChestEsp() {
      super("ChestESP", "Highlights nearby chests");
      this.Harry = new EnumSetting("Style", Jack, Style.Oliver);
      this.Jacob = new ArrayList();
      this.Charlie = new ArrayList();
      this.Thomas = new ArrayList();
      this.George = new ArrayList();
      this.Oliver((Category)Category.Harry);
      this.addSetting(this.Harry);
      "".length();
      if ((225 ^ 143 ^ 235 ^ 128) == 0) {
         throw null;
      }
   }

   private class_238 Oliver(class_2595 chestBE) {
      class_2680 state = chestBE.method_11010();
      class_238 var8;
      if (!state.method_28498(class_2281.field_10770)) {
         var8 = null;
         "".length();
         if (-"   ".length() >= 0) {
            return null;
         }
      } else {
         class_2745 chestType = (class_2745)state.method_11654(class_2281.field_10770);
         if (chestType == class_2745.field_12574) {
            var8 = null;
            "".length();
            if (-" ".length() == " ".length()) {
               return null;
            }
         } else {
            class_2338 pos = chestBE.method_11016();
            if (!BlockUtils.canBeClicked(pos)) {
               var8 = null;
               "".length();
               if ("   ".length() == -" ".length()) {
                  return null;
               }
            } else {
               class_238 box = BlockUtils.getBoundingBox(pos);
               if (chestType != class_2745.field_12569) {
                  class_2338 pos2 = pos.method_10093(class_2281.method_9758(state));
                  if (BlockUtils.canBeClicked(pos2)) {
                     class_238 box2 = BlockUtils.getBoundingBox(pos2);
                     box = box.method_991(box2);
                  }
               }

               var8 = box;
               "".length();
               if ("".length() >= "   ".length()) {
                  return null;
               }
            }
         }
      }

      return var8;
   }

   private void Oliver(class_243 start, ArrayList<class_238> boxes, int regionX, int regionZ) {
      Iterator var5 = boxes.iterator();

      do {
         if (!var5.hasNext()) {
            "".length();
            if ("".length() != 0) {
               return;
            }

            return;
         }

         class_238 box = (class_238)var5.next();
         class_243 end = box.method_1005();
         GL11.glVertex3d(start.field_1352 - (double)regionX, start.field_1351, start.field_1350 - (double)regionZ);
         GL11.glVertex3d(end.field_1352 - (double)regionX, end.field_1351, end.field_1350 - (double)regionZ);
         "".length();
      } while((35 ^ 38) > 0);

   }

   private void Oscar() {
      GL11.glDeleteLists(this.Oscar, 1);
      GL11.glDeleteLists(this.James, 1);
      GL11.glDeleteLists(this.William, 1);
      "".length();
      if (" ".length() == " ".length()) {
         ;
      }
   }

   public void Oliver(CameraTransformViewBobbingEvent event) {
      if ( Style.Oliver(( Style)this.Harry.Harry())) {
         event.Oliver();
      }

      "".length();
      if ("  ".length() >= "  ".length()) {
         ;
      }
   }

   private void George() {
      class_238 box = new class_238(class_2338.field_10980);
      this.Oscar = GL11.glGenLists(1);
      GL11.glNewList(this.Oscar, 4864);
      GL11.glColor4f(0.36078432F, 0.9607843F, 0.30588236F, 0.05F);
      RenderUtils.drawSolidBox(box);
      GL11.glColor4f(0.36078432F, 0.9607843F, 0.30588236F, 0.15F);
      RenderUtils.drawCrossBox(box);
      GL11.glEndList();
      this.James = GL11.glGenLists(1);
      GL11.glNewList(this.James, 4864);
      GL11.glColor4f(0.9607843F, 0.30588236F, 0.30588236F, 0.05F);
      RenderUtils.drawSolidBox(box);
      GL11.glColor4f(0.9607843F, 0.30588236F, 0.30588236F, 0.15F);
      RenderUtils.drawCrossBox(box);
      GL11.glEndList();
      this.William = GL11.glGenLists(1);
      GL11.glNewList(this.William, 4864);
      GL11.glColor4f(0.53333336F, 0.30588236F, 0.9607843F, 0.05F);
      RenderUtils.drawSolidBox(box);
      GL11.glColor4f(0.53333336F, 0.30588236F, 0.9607843F, 0.15F);
      RenderUtils.drawCrossBox(box);
      GL11.glEndList();
      this.Mary = GL11.glGenLists(1);
      "".length();
      if (-" ".length() <= 0) {
         ;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      EVENT_MANAGER.Jack(CameraTransformViewBobbingListener.class, this);
      EVENT_MANAGER.Jack(RenderListener.class, this);
      this.Oscar();
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   private ArrayList<class_238> Jack(float partialTicks) {
      ArrayList<class_238> minecartBoxes = new ArrayList(this.George.size());
      this.George.forEach((e) -> {
         double offsetX = -(e.method_23317() - e.field_6038) + (e.method_23317() - e.field_6038) * (double)partialTicks;
         double offsetY = -(e.method_23318() - e.field_5971) + (e.method_23318() - e.field_5971) * (double)partialTicks;
         double offsetZ = -(e.method_23321() - e.field_5989) + (e.method_23321() - e.field_5989) * (double)partialTicks;
         minecartBoxes.add(e.method_5829().method_989(offsetX, offsetY, offsetZ));
         "".length();
         "".length();
         if (" ".length() != 0) {
            ;
         }
      });
      "".length();
      return "   ".length() == (73 + 46 - -7 + 35 ^ 109 + 126 - 99 + 29) ? null : minecartBoxes;
   }

   private void Oliver(ArrayList<class_238> boxes, int displayList, int regionX, int regionZ) {
      Iterator var5 = boxes.iterator();

      do {
         if (!var5.hasNext()) {
            "".length();
            if ("   ".length() < -" ".length()) {
               return;
            }

            return;
         }

         class_238 box = (class_238)var5.next();
         GL11.glPushMatrix();
         GL11.glTranslated(box.field_1323 - (double)regionX, box.field_1322, box.field_1321 - (double)regionZ);
         GL11.glScaled(box.field_1320 - box.field_1323, box.field_1325 - box.field_1322, box.field_1324 - box.field_1321);
         GL11.glCallList(displayList);
         GL11.glPopMatrix();
         "".length();
      } while((99 ^ 79 ^ 120 ^ 80) == (69 + 86 - 109 + 105 ^ 137 + 31 - 115 + 94));

   }

   public void Thomas() {
      this.Jacob.clear();
      this.Charlie.clear();
      this.Thomas.clear();
      Iterator var1 = mc.field_1687.field_9231.iterator();

      label75:
      do {
         while(var1.hasNext()) {
            class_2586 blockEntity = (class_2586)var1.next();
            class_238 box;
            if (blockEntity instanceof class_2646) {
               box = this.Oliver((class_2595)blockEntity);
               if (box != null) {
                  this.Charlie.add(box);
                  "".length();
               }

               "".length();
               if (-" ".length() > -" ".length()) {
                  return;
               }
            } else if (blockEntity instanceof class_2595) {
               box = this.Oliver((class_2595)blockEntity);
               if (box != null) {
                  this.Jacob.add(box);
                  "".length();
               }

               "".length();
               if ("".length() != "".length()) {
                  return;
               }
            } else {
               class_238 bb;
               class_2338 pos;
               if (blockEntity instanceof class_2611) {
                  pos = blockEntity.method_11016();
                  if (!BlockUtils.canBeClicked(pos)) {
                     "".length();
                     continue label75;
                  }

                  bb = BlockUtils.getBoundingBox(pos);
                  this.Thomas.add(bb);
                  "".length();
                  "".length();
                  if (" ".length() < " ".length()) {
                     return;
                  }
               } else if (blockEntity instanceof class_3719) {
                  pos = blockEntity.method_11016();
                  if (!BlockUtils.canBeClicked(pos)) {
                     "".length();
                     if (-" ".length() >= "   ".length()) {
                        return;
                     }
                     continue;
                  }

                  bb = BlockUtils.getBoundingBox(pos);
                  this.Jacob.add(bb);
                  "".length();
               }
            }

            "".length();
            if ("".length() < 0) {
               return;
            }
         }

         if (class_824.field_4346.field_4344 != null) {
            class_2338 camPos = RenderUtils.getCameraBlockPos();
            int regionX = (camPos.method_10263() >> 9) * 512;
            int regionZ = (camPos.method_10260() >> 9) * 512;
            GL11.glNewList(this.Mary, 4864);
            this.Oliver(this.Jacob, this.Oscar, regionX, regionZ);
            this.Oliver(this.Charlie, this.James, regionX, regionZ);
            this.Oliver(this.Thomas, this.William, regionX, regionZ);
            GL11.glEndList();
         }

         this.George.clear();
         var1 = mc.field_1687.method_18112().iterator();

         do {
            if (!var1.hasNext()) {
               "".length();
               if ("   ".length() != "   ".length()) {
                  return;
               }

               return;
            }

            class_1297 entity = (class_1297)var1.next();
            if (entity instanceof class_1694) {
               this.George.add(entity);
               "".length();
            }

            "".length();
         } while(null == null);

         return;
      } while("  ".length() != (183 ^ 179));

   }

   public void Oliver(float partialTicks) {
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(2848);
      RenderUtils.setLineWidth(2.0F);
      GL11.glDisable(3553);
      class_4493.method_22076();
      GL11.glDisable(2929);
      GL11.glDisable(2896);
      GL11.glPushMatrix();
      RenderUtils.applyRegionalRenderOffset();
      ArrayList<class_238> minecartBoxes = this.Jack(partialTicks);
      class_2338 camPos = RenderUtils.getCameraBlockPos();
      int regionX = (camPos.method_10263() >> 9) * 512;
      int regionZ = (camPos.method_10260() >> 9) * 512;
      if ( Style.Jack(( Style)this.Harry.Harry())) {
         GL11.glCallList(this.Mary);
         this.Oliver(minecartBoxes, this.Oscar, regionX, regionZ);
      }

      if ( Style.Oliver(( Style)this.Harry.Harry())) {
         class_243 start = RotationUtils.getClientLookVec().method_1019(RenderUtils.getCameraPos());
         GL11.glBegin(1);
         GL11.glColor4f(0.36078432F, 0.9607843F, 0.30588236F, 0.25F);
         this.Oliver(start, this.Jacob, regionX, regionZ);
         this.Oliver(start, minecartBoxes, regionX, regionZ);
         GL11.glColor4f(0.9607843F, 0.30588236F, 0.30588236F, 0.25F);
         this.Oliver(start, this.Charlie, regionX, regionZ);
         GL11.glColor4f(0.53333336F, 0.30588236F, 0.9607843F, 0.25F);
         this.Oliver(start, this.Thomas, regionX, regionZ);
         GL11.glEnd();
      }

      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable(2929);
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glDisable(2848);
      "".length();
      if ("  ".length() != 0) {
         ;
      }
   }

   static {
      "".length();
      if ((169 ^ 173 ^ "".length()) > "  ".length()) {
         ;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      EVENT_MANAGER.Oliver(CameraTransformViewBobbingListener.class, this);
      EVENT_MANAGER.Oliver(RenderListener.class, this);
      this.George();
      "".length();
      if (-" ".length() < "   ".length()) {
         ;
      }
   }

   private static enum Style {
      // $FF: synthetic field
      private final boolean Thomas;
      // $FF: synthetic field
      Harry("Both", true, true);

      // $FF: synthetic field
      private final boolean Charlie;
      // $FF: synthetic field
      Oliver("HitBoxes", true, false);

      // $FF: synthetic field
      private final String Jacob;
      // $FF: synthetic field
      Jack("Tracers", false, true);

      private Style(String name, boolean boxes, boolean lines) {
         this.Jacob = name;
         this.Charlie = boxes;
         this.Thomas = lines;
         "".length();
         if (" ".length() <= 0) {
            throw null;
         }
      }

      static {
         "".length();
         if ("  ".length() < (76 ^ 56 ^ 92 ^ 44)) {
            ;
         }
      }

      // $FF: synthetic method
      static boolean Oliver( Style x0) {
         byte var1 = x0.Thomas;
         "".length();
         return (boolean)(-" ".length() > 0 ? "".length() : var1);
      }

      // $FF: synthetic method
      static boolean Jack( Style x0) {
         byte var1 = x0.Charlie;
         "".length();
         return (boolean)(null != null ? "".length() : var1);
      }

      public String toString() {
         String var1 = this.Jacob;
         "".length();
         return "   ".length() <= " ".length() ? null : var1;
      }
   }
}
