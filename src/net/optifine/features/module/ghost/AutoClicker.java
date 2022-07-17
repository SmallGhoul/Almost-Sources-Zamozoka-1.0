package net.optifine.features.module.ghost;

import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.config.EnumSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.MouseButtonListener;
import net.optifine.managers.event.events.PreMotionListener;
import net.optifine.managers.event.events.RenderListener;
import net.optifine.util.GeneralSettings.PacketOrder;
import net.optifine.util.RotationUtils;
import net.optifine.util.math.MathUtils;
import net.minecraft.class_1268;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3541;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class AutoClicker extends Module implements PreMotionListener, RenderListener, MouseButtonListener {
   // $FF: synthetic field
   BooleanSetting Jacob;
   // $FF: synthetic field
   long Elizabeth;
   // $FF: synthetic field
   double William;
   // $FF: synthetic field
   class_3541 Linda;
   // $FF: synthetic field
   double Jennifer;
   // $FF: synthetic field
   NumberSetting Thomas;
   // $FF: synthetic field
   NumberSetting Charlie;
   // $FF: synthetic field
   double Patricia;
   // $FF: synthetic field
   public static final PacketOrder[] Jack = PacketOrder.values();
   // $FF: synthetic field
   EnumSetting<PacketOrder> Harry;
   // $FF: synthetic field
   double Mary;
   // $FF: synthetic field
   double James;
   // $FF: synthetic field
   boolean George;
   // $FF: synthetic field
   double Oscar;

   protected void Charlie() {
      EVENT_MANAGER.Jack(PreMotionListener.class, this);
      EVENT_MANAGER.Jack(MouseButtonListener.class, this);
      EVENT_MANAGER.Jack(RenderListener.class, this);
      this.George = false;
      "".length();
      if (null == null) {
         ;
      }
   }

   static {
      "".length();
      if ("  ".length() == "  ".length()) {
         ;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(PreMotionListener.class, this);
      EVENT_MANAGER.Oliver(MouseButtonListener.class, this);
      EVENT_MANAGER.Oliver(RenderListener.class, this);
      this.Elizabeth = System.currentTimeMillis();
      "".length();
      if ("   ".length() >= 0) {
         ;
      }
   }

   public void George() {
      if (this.George && mc.field_1755 == null) {
         if (llIII(this.Elizabeth, System.currentTimeMillis()) <= 0) {
            if (this.Harry.Harry() == PacketOrder.v1_8) {
               mc.field_1724.method_6104(class_1268.field_5808);
            }

            if (mc.field_1765.method_17783().equals(class_240.field_1331) && mc.field_1765 != null && !Global.Oscar().contains(mc.field_1692.method_5820())) {
               mc.field_1761.method_2918(mc.field_1724, mc.field_1692);
            }

            if (this.Harry.Harry() == PacketOrder.v1_9) {
               mc.field_1724.method_6104(class_1268.field_5808);
            }

            boolean var10000;
            if (llIIl(this.Patricia, this.William) == 0 && llIIl(this.Jennifer, this.Mary) == 0) {
               var10000 = false;
            } else {
               var10000 = true;
               "".length();
               if (null != null) {
                  return;
               }
            }

            boolean isMoving = var10000;
            if (llIlI(ThreadLocalRandom.current().nextGaussian(), -1.5D) < 0 || isMoving) {
               double var10001 = this.Oscar;
               double var10002 = ThreadLocalRandom.current().nextGaussian();
               byte var10003;
               if (isMoving) {
                  var10003 = 3;
                  "".length();
                  if ("   ".length() < 0) {
                     return;
                  }
               } else {
                  var10003 = 2;
               }

               this.Oscar = var10001 + var10002 / (double)var10003;
               var10001 = this.James;
               var10002 = MathUtils.clamp(-1.5D, ThreadLocalRandom.current().nextGaussian(), 1.5D);
               double var2;
               if (isMoving) {
                  var2 = 2.5D;
                  "".length();
                  if ((108 ^ 38 ^ 196 ^ 138) == 0) {
                     return;
                  }
               } else {
                  var2 = 1.8D;
               }

               this.James = var10001 + var10002 / var2 + 0.15D;
            }

            this.Thomas();
            "".length();
            if ("".length() != 0) {
               return;
            }
         }
      } else if (mc.field_1755 != null) {
         this.Elizabeth = System.currentTimeMillis();
      }

      "".length();
      if ("  ".length() > 0) {
         ;
      }
   }

   private void Thomas() {
      double osc1 = this.Linda.method_15433((double)System.currentTimeMillis() / 300.0D % 2.147483647E9D / 2.0D, 0.0D) * (this.Thomas.Jack() - this.Charlie.Jack());
      double osc2 = this.Linda.method_15433((double)System.currentTimeMillis() / 4000.0D % 2.147483647E9D / 2.0D, 0.0D) * (this.Thomas.Jack() - this.Charlie.Jack()) / 2.0D;
      Random random = ThreadLocalRandom.current();
      double rnd = (MathUtils.clamp(random.nextGaussian(), -2.0D, 2.0D) / 4.0D + 0.5D) * (random.nextDouble() + 1.0D) / 2.0D;
      double min = this.Charlie.Jack() + osc1 + osc2;
      double max = this.Thomas.Jack() + osc1 + osc2;
      double cps = min + rnd * (max - min);
      long cd = (long)(1000.0D / cps);
      this.Elizabeth += cd;
      long var10001 = this.Elizabeth - cd / 3L;
      Global.Jack().E.Oliver(var10001);
      "".length();
      if ("  ".length() >= -" ".length()) {
         ;
      }
   }

   public AutoClicker() {
      super("AutoClicker");
      this.Harry = new EnumSetting("Packet Order", Jack, PacketOrder.v1_9);
      this.Jacob = new BooleanSetting("Jitter", false);
      this.Charlie = new NumberSetting("Min CPS", 9.0D, 1.0D, 20.0D, 0.1D, ValueDisplay.Oliver);
      this.Thomas = new NumberSetting("Max CPS", 14.0D, 1.0D, 20.0D, 0.1D, ValueDisplay.Oliver);
      this.Linda = new class_3541(ThreadLocalRandom.current());
      this.Oliver(Category.Oscar);
      this.addSetting(this.Harry);
      this.addSetting(this.Charlie);
      this.addSetting(this.Thomas);
      this.addSetting(this.Jacob);
      "".length();
      if (null != null) {
         throw null;
      }
   }

   private static int llIII(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   public void Oliver(float partialTicks) {
      this.Patricia = this.William;
      this.Jennifer = this.Mary;
      this.William = (double)mc.field_1724.field_6031;
      this.Mary = (double)mc.field_1724.field_5965;
      if (this.Jacob.Jack()) {
         mc.field_1724.field_6031 += RotationUtils.getFixedRotation((float)this.Oscar);
         mc.field_1724.field_5965 = MathUtils.clamp(-90.0F, RotationUtils.getFixedRotation((float)this.James) + mc.field_1724.field_5965, 90.0F);
      }

      this.Oscar /= Math.pow(7.0D, (double)mc.method_1534());
      this.James /= Math.pow(7.0D, (double)mc.method_1534());
      "".length();
      if (-" ".length() <= 0) {
         ;
      }
   }

   public String Oliver() {
      String var1 = String.valueOf((new StringBuilder()).append(this.Charlie.William()).append(" - ").append(this.Thomas.William()));
      "".length();
      return -(98 + 19 - 4 + 74 ^ 170 + 117 - 259 + 163) >= 0 ? null : var1;
   }

   public void Oliver(long window, int button, int action, int mods) {
      if (button == 0) {
         boolean var10001;
         if (action == 1) {
            var10001 = true;
            "".length();
            if (-" ".length() > (51 ^ 55)) {
               return;
            }
         } else {
            var10001 = false;
         }

         this.George = var10001;
         if (this.George && mc.field_1755 == null) {
            this.Elizabeth = System.currentTimeMillis();
            this.Thomas();
         }
      }

      "".length();
      if (" ".length() != 0) {
         ;
      }
   }

   private static int llIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int llIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }
}
