package net.optifine.features.module.world;

import com.sun.javafx.geom.CubicCurve2D;
import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.managers.event.events.*;
import net.optifine.managers.event.events.PacketInputListener.PacketInputEvent;
import net.optifine.managers.event.events.PacketOutputListener.PacketOutputEvent;
import net.optifine.util.BlockUtils;
import net.optifine.util.font.TTFFontRenderer;
import net.optifine.util.math.MathUtils;
import net.optifine.util.render.RenderUtils;
import net.optifine.util.theme.ThemeManager;
import net.minecraft.*;
import net.minecraft.class_2846.class_2847;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class XRay extends Module implements PacketOutputListener, PacketInputListener, Render2DListener, UpdateListener, RenderListener {
   // $FF: synthetic field
   int George = 0;
   // $FF: synthetic field
   public final BooleanSetting Thomas = new BooleanSetting("Ignore Air", "Some ore-obfuscators can replace ores with air, but some will not do it. Makes the research slower but better.", true);
   // $FF: synthetic field
   public final NumberSetting Harry = new NumberSetting("Range", 5.0D, 5.0D, 100.0D, 1.0D);
   // $FF: synthetic field
   public final BooleanSetting Charlie = new BooleanSetting("Render Process", true);
   // $FF: synthetic field
   public final NumberSetting Jack = new NumberSetting("Speed", 1.0D, 1.0D, 15.0D, 1.0D);
   // $FF: synthetic field
   int Elizabeth = 0;
   // $FF: synthetic field
   private final CubicCurve2D Barbara = new CubicCurve2D(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   // $FF: synthetic field
   int Jennifer = 0;
   // $FF: synthetic field
   boolean Linda = false;
   // $FF: synthetic field
   ArrayList<class_2338> William = new ArrayList();
   // $FF: synthetic field
   public final NumberSetting Jacob = new NumberSetting("Accuracy", "Research accuracy. 1 - maximum but slow, 3 - fast but extremely inaccurate.", 1.0D, 1.0D, 3.0D, 1.0D);
   // $FF: synthetic field
   ArrayList<class_2338> Patricia = new ArrayList();
   // $FF: synthetic field
   ArrayList<class_2338> Mary = new ArrayList();
   // $FF: synthetic field
   float Oscar = 0.0F;
   // $FF: synthetic field
   ArrayList<class_2338> James = new ArrayList();

   public void Thomas() {
      ++this.Elizabeth;
      int j = 0;

      while(true) {
         int var10001;
         if (this.Elizabeth % 200 == 0) {
            var10001 = 1;
            "".length();
            if (-" ".length() > 0) {
               return;
            }
         } else {
            var10001 = this.Jack.Oscar();
         }

         if (j >= var10001) {
            break;
         }

         if (this.James.size() <= 0) {
            if (!this.Linda) {
               Global.Thomas().getNotificationManager().spawnNotification(this, "X-Ray analysis completed successfully.");
               Global.Thomas().getNotificationManager().spawnNotification(this, String.valueOf((new StringBuilder()).append("Total analysed: ").append(this.George)));
               this.Linda = true;
               "".length();
               if (-"  ".length() > 0) {
                  return;
               }
            }
            break;
         }

         class_2338 pos = (class_2338)this.James.remove(0);

         while(!this.Oliver(pos) && this.James.size() > 0) {
            pos = (class_2338)this.James.remove(0);
            "".length();
            if ("  ".length() == (134 ^ 154 ^ 78 ^ 86)) {
               return;
            }
         }

         if (this.James.size() < 1) {
            "".length();
            if ("   ".length() < " ".length()) {
               return;
            }
            break;
         }

         if (lIlIlI((double)pos.method_10264(), mc.field_1724.method_19538().method_1031(0.0D, (double)mc.field_1724.method_18381(mc.field_1724.method_18376()), 0.0D).field_1351) < 0) {
            mc.field_1724.field_3944.method_2883(new class_2846(class_2847.field_12968, pos, class_2350.field_11036));
            "".length();
            if ("".length() > "   ".length()) {
               return;
            }
         } else {
            mc.field_1724.field_3944.method_2883(new class_2846(class_2847.field_12968, pos, class_2350.field_11033));
         }

         "".length();
         if (" ".length() <= "".length()) {
            return;
         }

         ++j;
         "".length();
         if (" ".length() < -" ".length()) {
            return;
         }
      }

      "".length();
      if (-(79 ^ 75) < 0) {
         ;
      }
   }

   public void Oliver(float partialTicks) {
      float var10001 = this.Oscar;
      float var10002;
      if (!this.Linda) {
         var10002 = Global.Oliver.method_1534();
         "".length();
         if (null != null) {
            return;
         }
      } else {
         var10002 = -Global.Oliver.method_1534();
      }

      this.Oscar = var10001 + var10002;
      this.Oscar = (float)MathUtils.clamp(-1.5D, (double)this.Oscar, 1.5D);
      float percent = 1.0F - (float)this.James.size() / (float)this.Jennifer;
      if (this.Charlie.Jack()) {
         GL11.glDisable(3553);
         class_4493.method_22078();
         GL11.glDisable(2929);
         GL11.glEnable(3042);
         GL11.glShadeModel(7425);
         GL11.glBlendFunc(770, 771);
         GL11.glPushMatrix();
         RenderUtils.setLineWidth(0.5F);
         class_4184 camera = class_824.field_4346.field_4344;
         GL11.glRotated((double)class_3532.method_15393(-camera.method_19329()), 1.0D, 0.0D, 0.0D);
         GL11.glRotated(class_3532.method_15338(12.0D), 1.0D, 0.0D, 0.0D);
         RenderUtils.applyRegionalRenderOffset();
         class_1297 e = mc.field_1724;
         double yaw = Math.toRadians((double)mc.field_1724.field_6031);
         GL11.glTranslated(e.field_6014 + (e.method_23317() - e.field_6014) * (double)partialTicks - Math.sin(yaw) * 1.2D, e.field_6036 + (e.method_23318() - e.field_6036) * (double)partialTicks + 0.7D, e.field_5969 + (e.method_23321() - e.field_5969) * (double)partialTicks + Math.cos(yaw) * 1.2D);
         int alpha = (int)this.Barbara.eval((float)((double)(this.Oscar / 3.0F) + 0.5D)).y;
         float yH = 0.1F;
         float xW;
         float zW;
         if (lIlIll((double)percent, 0.8D) >= 0) {
            yH = 0.1F + 0.3F * (percent - 0.8F) / 0.2F;
            xW = 0.4F;
            zW = 0.4F;
            "".length();
            if ("   ".length() == 0) {
               return;
            }
         } else {
            xW = 0.4F * (percent / 0.8F);
            zW = 0.4F * (percent / 0.8F);
         }

         GL11.glTranslated(-0.2D, 0.0D, -0.2D);
         class_238 bb = new class_238(0.0D, 0.0D, 0.0D, (double)xW, (double)yH, (double)zW);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.1F * (float)alpha);
         RenderUtils.drawSolidBox(bb);
         GL11.glTranslated(0.2D, 0.0D, 0.2D);
         bb = new class_238(-0.2D, 0.0D, -0.2D, 0.2D, 0.4D, 0.2D);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.8F * (float)alpha);
         RenderUtils.drawOutlinedBox(bb);
         GL11.glPopMatrix();
         GL11.glEnable(3553);
         class_4493.method_22076();
         GL11.glEnable(2929);
      }

      if (this.William.size() < 1) {
         "".length();
         if ("".length() >= (108 ^ 104)) {
            return;
         }
      } else {
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(2848);
         RenderUtils.setLineWidth(2.0F);
         GL11.glDisable(3553);
         class_4493.method_22076();
         GL11.glDisable(2929);
         GL11.glDisable(2896);
         GL11.glPushMatrix();
         RenderUtils.applyRenderOffset();
         Iterator var12 = this.William.iterator();

         class_2338 pos;
         while(var12.hasNext()) {
            pos = (class_2338)var12.next();
            if (BlockUtils.canBeClicked(pos)) {
               GL11.glColor4f(0.20392157F, 0.59607846F, 0.85882354F, 0.05F);
               RenderUtils.drawSolidBox(BlockUtils.getBoundingBox(pos));
               GL11.glColor4f(0.20392157F, 0.59607846F, 0.85882354F, 0.4F);
               RenderUtils.drawCrossBox(BlockUtils.getBoundingBox(pos));
            }

            "".length();
            if ("   ".length() == 0) {
               return;
            }
         }

         var12 = this.Patricia.iterator();

         while(var12.hasNext()) {
            pos = (class_2338)var12.next();
            if (BlockUtils.canBeClicked(pos)) {
               GL11.glColor4f(0.21960784F, 0.87058824F, 0.45490196F, 0.05F);
               RenderUtils.drawSolidBox(BlockUtils.getBoundingBox(pos));
               GL11.glColor4f(0.21960784F, 0.87058824F, 0.45490196F, 0.4F);
               RenderUtils.drawCrossBox(BlockUtils.getBoundingBox(pos));
            }

            "".length();
            if ("   ".length() <= " ".length()) {
               return;
            }
         }

         var12 = this.Mary.iterator();

         while(var12.hasNext()) {
            pos = (class_2338)var12.next();
            if (BlockUtils.canBeClicked(pos)) {
               GL11.glColor4f(0.73333335F, 0.69803923F, 0.45882353F, 0.05F);
               RenderUtils.drawSolidBox(BlockUtils.getBoundingBox(pos));
               GL11.glColor4f(0.73333335F, 0.69803923F, 0.45882353F, 0.4F);
               RenderUtils.drawCrossBox(BlockUtils.getBoundingBox(pos));
            }

            "".length();
            if ((180 ^ 176) <= 0) {
               return;
            }
         }

         GL11.glPopMatrix();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glEnable(2929);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
         GL11.glDisable(2848);
         "".length();
         if ("   ".length() == 0) {
            return;
         }
      }

   }

   public void onRender2D(class_4587 matrixStack, float partialTicks) {
      float percent = 1.0F - (float)this.James.size() / (float)this.Jennifer;
      if (this.Charlie.Jack()) {
         TTFFontRenderer font = Global.Harry.getSmallMain();
         String sfw = String.valueOf((new StringBuilder()).append("Completed: ").append(this.Jennifer).append(" / ").append(this.Jennifer).append(" (100.00%)"));
         String s = String.valueOf((new StringBuilder()).append("Completed: ").append(this.Jennifer - this.James.size()).append(" / ").append(this.Jennifer).append(" (").append((double)((int)(percent * 10000.0F)) / 100.0D).append("%)"));
         String ss = String.valueOf((new StringBuilder()).append("").append((int)((float)this.James.size() / this.Jack.George() / 20.0F)).append("s remaining"));
         float x = (float)mc.method_22683().method_4486() * 0.5F - font.getWidth(sfw) / 2.0F;
         float y = (float)mc.method_22683().method_4502() * 0.9F - 3.0F;
         if (lIllIl(percent, 1.0F) != 0) {
            RenderUtils.drawCircle(x, y, 4.0F, new Color(134217727, true), 2.0F, 1.0F, 1.0F);
            RenderUtils.drawCircle(x, y, 4.0F, new Color(352321535, true), 2.0F, 1.0F, percent);
            "".length();
            if ("  ".length() == "".length()) {
               return;
            }
         } else {
            GL11.glDisable(3553);
            GL11.glEnable(2848);
            GL11.glEnable(3042);
            RenderUtils.setLineWidth(1.5F);
            ThemeManager.useColor(Color.WHITE, 0.27F);
            GL11.glBegin(1);
            GL11.glVertex2d((double)(x - 3.0F), (double)y);
            GL11.glVertex2d((double)x, (double)(y + 3.0F));
            GL11.glVertex2d((double)x, (double)(y + 3.0F));
            GL11.glVertex2d((double)(x + 5.0F), (double)(y - 2.0F));
            GL11.glEnd();
            GL11.glDisable(2848);
            RenderUtils.setLineWidth(1.0F);
         }

         font.drawString(s, (double)((float)((double)mc.method_22683().method_4486() * 0.5D) + 6.0F) - (double)font.getWidth(sfw) / 2.0D, (double)((float)mc.method_22683().method_4502() * 0.9F - 8.0F), 1174405119);
         "".length();
         if (!this.Linda) {
            font.drawString(ss, (double)((float)((double)mc.method_22683().method_4486() * 0.5D)) - (double)font.getWidth(ss) / 2.0D, (double)((float)mc.method_22683().method_4502() * 0.9F - 8.0F) + (double)font.getHeight(ss) / 1.5D, 1174405119);
            "".length();
            "".length();
            if (-" ".length() != -" ".length()) {
               return;
            }
         } else {
            font.drawString("Completed.", (double)((float)((double)mc.method_22683().method_4486() * 0.5D)) - (double)font.getWidth(ss) / 2.0D, (double)((float)mc.method_22683().method_4502() * 0.9F - 8.0F) + (double)font.getHeight(ss) / 1.5D, 1174405119);
            "".length();
         }
      }

      "".length();
      if ((14 ^ 10) >= 0) {
         ;
      }
   }

   private static int lIlIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIllIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public void Oliver(PacketInputEvent event) {
      if (event.Jacob() instanceof class_2626) {
         class_2626 p = (class_2626)event.Jacob();
         class_2248 b = p.method_11308().method_26204();
         if (b.equals(class_2246.field_10442) && !this.William.contains(p.method_11309())) {
            this.William.add(p.method_11309());
            "".length();
         }

         if (b.equals(class_2246.field_10212) && !this.Mary.contains(p.method_11309())) {
            this.Mary.add(p.method_11309());
            "".length();
         }

         if (b.equals(class_2246.field_10013) && !this.Patricia.contains(p.method_11309())) {
            this.Patricia.add(p.method_11309());
            "".length();
         }

         ++this.George;
         "".length();
         if ("  ".length() > "  ".length()) {
            return;
         }
      } else if (event.Jacob() instanceof class_2637) {
         class_2637 p = (class_2637)event.Jacob();
         p.method_30621((pos, state) -> {
            if (state.method_26204().equals(class_2246.field_10442) && !this.William.contains(pos)) {
               this.William.add(pos);
               "".length();
            }

            if (state.method_26204().equals(class_2246.field_10212) && !this.Mary.contains(pos)) {
               this.Mary.add(pos);
               "".length();
            }

            if (state.method_26204().equals(class_2246.field_10013) && !this.Patricia.contains(pos)) {
               this.Patricia.add(pos);
               "".length();
            }

            "".length();
            if ("  ".length() <= (59 ^ 63)) {
               ;
            }
         });
         ++this.George;
      }

      "".length();
      if ("".length() <= 0) {
         ;
      }
   }

   public XRay() {
      super("X-Ray", "Allows you to see ores through blocks.", Category.Jacob);
      this.addSetting(this.Jack);
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      this.addSetting(this.Thomas);
      "".length();
      if (null != null) {
         throw null;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      EVENT_MANAGER.Jack(RenderListener.class, this);
      EVENT_MANAGER.Jack(Render2DListener.class, this);
      EVENT_MANAGER.Jack(PacketOutputListener.class, this);
      EVENT_MANAGER.Jack(PacketInputListener.class, this);
      "".length();
      if ("".length() <= 0) {
         ;
      }
   }

   private static int lIlIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private boolean Oliver(class_2338 pos) {
      class_2248 b = BlockUtils.getBlock(pos);
      byte var10000;
      if ((!this.Thomas.Jack() || !b.equals(class_2246.field_10124) && !b.equals(class_2246.field_10340)) && pos.method_10263() % this.Jacob.Oscar() == 0 && pos.method_10264() % this.Jacob.Oscar() == 0 && pos.method_10260() % this.Jacob.Oscar() == 0) {
         var10000 = 1;
         "".length();
         if ("  ".length() < 0) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var3 = var10000;
      "".length();
      return (boolean)(" ".length() <= "".length() ? "".length() : var3);
   }

   protected void Jacob() {
      if (mc.field_1724 == null) {
         this.Jack(false);
         "".length();
         if (" ".length() <= 0) {
            return;
         }
      } else {
         EVENT_MANAGER.Oliver(UpdateListener.class, this);
         EVENT_MANAGER.Oliver(RenderListener.class, this);
         EVENT_MANAGER.Oliver(Render2DListener.class, this);
         EVENT_MANAGER.Oliver(PacketOutputListener.class, this);
         EVENT_MANAGER.Oliver(PacketInputListener.class, this);
         this.James = (ArrayList)this.Oliver(mc.field_1724.method_24515(), this.Harry.Oscar()).filter(this::Oliver).collect(Collectors.toCollection(ArrayList::new));
         this.Jennifer = this.James.size();
         mc.field_1769.method_3279();
         this.William.clear();
         this.George = 0;
         this.Linda = false;
         "".length();
         if ("  ".length() < 0) {
            return;
         }
      }

   }

   public void onSentPacket(PacketOutputEvent event) {
      "".length();
      if (" ".length() >= "".length()) {
         ;
      }
   }

   private Stream<class_2338> Oliver(class_2338 center, int range) {
      class_2338 min = center.method_10080((double)(-range), (double)center.method_10264() + (double)range / 2.0D, (double)(-range));
      class_2338 max = center.method_10069(range, center.method_10264() - range, range);
      Stream var5 = BlockUtils.getAllInBox(min, max).stream();
      "".length();
      return -" ".length() >= "".length() ? null : var5;
   }

   static {
      "".length();
      if ("".length() == 0) {
         ;
      }
   }
}
