package net.optifine.features.module.render;

import net.optifine.Global;
import net.optifine.config.DoubleSliderSetting;
import net.optifine.config.EnumSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.config.Splitter;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class AntiAim extends Module implements UpdateListener {
   // $FF: synthetic field
   double James;
   // $FF: synthetic field
   NumberSetting Oscar;
   // $FF: synthetic field
   NumberSetting Charlie;
   // $FF: synthetic field
   float Mary;
   // $FF: synthetic field
   NumberSetting George;
   // $FF: synthetic field
   EnumSetting< Mode> Jack;
   // $FF: synthetic field
   NumberSetting Jacob;
   // $FF: synthetic field
   float[] Elizabeth;
   // $FF: synthetic field
   NumberSetting Thomas;
   // $FF: synthetic field
   double William;
   // $FF: synthetic field
   float Patricia;
   // $FF: synthetic field
   float[] Jennifer;
   // $FF: synthetic field
   DoubleSliderSetting Harry;

   protected void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      this.James = 0.0D;
      this.William = 0.0D;
      "".length();
      if ((89 ^ 93) >= (26 ^ 30)) {
         ;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if (null == null) {
         ;
      }
   }

   public void Thomas() {
      Random rnd = ThreadLocalRandom.current();
      switch(( Mode)this.Jack.Harry()) {
      case Oliver:
         this.Mary = (float)((this.Harry.Oscar() - 0.5D) * 360.0D);
         this.Patricia = (float)((this.Harry.James() - 0.5D) * 360.0D);
         "".length();
         if ("".length() != 0) {
            return;
         }
         break;
      case Jacob:
         if (lIIIIllIIl(this.James++ % (double)this.Oscar.Oscar(), 0.0D) == 0) {
            this.Mary = this.Jennifer[rnd.nextInt(this.Jennifer.length)];
            this.Patricia = this.Elizabeth[rnd.nextInt(this.Elizabeth.length)];
            "".length();
            if ("  ".length() == "   ".length()) {
               return;
            }
         }
         break;
      case Harry:
         if (lIIIIllIIl(this.James++ % (double)this.Thomas.Oscar(), 0.0D) == 0) {
            this.Mary = mc.field_1773.method_19418().method_19330() - rnd.nextFloat() * this.George.George() - 180.0F + this.George.George() / 2.0F;
            this.Patricia = 90.0F - rnd.nextFloat() * 20.0F + 10.0F;
            "".length();
            if ("   ".length() != "   ".length()) {
               return;
            }
         }
         break;
      case Jack:
         this.Mary = (float)(this.William += this.Jacob.Jack());
         this.Patricia = this.Charlie.George();
      }

      Global.George().setHeadYaw(this.Mary);
      Global.George().setHeadPitch(this.Patricia);
      "".length();
      if (" ".length() > 0) {
         ;
      }
   }

   public AntiAim() {
      super("AntiAim", "", Category.Harry);
      this.Jack = new EnumSetting("Mode", Mode.values(), Mode.Jack);
      this.Harry = new DoubleSliderSetting("Static Position", 0.5D, 0.5D);
      this.Jacob = new NumberSetting("Spin Speed", -180.0D, 0.1D, 180.0D, 0.1D);
      this.Charlie = new NumberSetting("Spin Pitch", 90.0D, -90.0D, 90.0D, 1.0D);
      this.Thomas = new NumberSetting("OTC Speed", 5.0D, 1.0D, 40.0D, 1.0D);
      this.George = new NumberSetting("OTC Amount", 30.0D, 0.0D, 360.0D, 1.0D);
      this.Oscar = new NumberSetting("skeet.cc ticks", 8.0D, 1.0D, 15.0D, 1.0D, ValueDisplay.Jack);
      this.James = 0.0D;
      this.William = 0.0D;
      this.Jennifer = new float[]{0.0F, 75.0F, 270.0F, 140.0F, 50.0F, 330.0F};
      this.Elizabeth = new float[]{90.0F, 80.0F, 90.0F, 80.0F, 90.0F, 80.0F, 10.0F};
      this.addSetting(this.Jack);
      this.addSetting(new Splitter("Static settings"));
      this.addSetting(this.Harry);
      this.addSetting(new Splitter("Spin Settings"));
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      this.addSetting(new Splitter("OTC Settings"));
      this.addSetting(this.Thomas);
      this.addSetting(this.George);
      this.addSetting(new Splitter("skeet.cc Settings"));
      this.addSetting(this.Oscar);
      "".length();
      if ((121 ^ 83 ^ 81 ^ 127) == 0) {
         throw null;
      }
   }

   private static int lIIIIllIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public String Oliver() {
      String var1 = Mode.Oliver(( Mode)this.Jack.Harry());
      "".length();
      return "  ".length() <= 0 ? null : var1;
   }

   static {
      "".length();
      if (-" ".length() < "   ".length()) {
         ;
      }
   }

   private static enum Mode {
      // $FF: synthetic field
      Oliver("Static"),
      // $FF: synthetic field
      Jack("Spin"),
      // $FF: synthetic field
      Jacob("skeet.cc");

      // $FF: synthetic field
      private final String Charlie;
      // $FF: synthetic field
      Harry("OTC v4");

      // $FF: synthetic method
      static String Oliver( Mode x0) {
         String var1 = x0.Charlie;
         "".length();
         return "".length() != 0 ? null : var1;
      }

      private Mode(String name) {
         this.Charlie = name;
         "".length();
         if (null != null) {
            throw null;
         }
      }

      public String toString() {
         String var1 = this.Charlie;
         "".length();
         return "  ".length() >= (235 ^ 136 ^ 253 ^ 154) ? null : var1;
      }

      static {
         "".length();
         if (-" ".length() != "".length()) {
            ;
         }
      }
   }
}
