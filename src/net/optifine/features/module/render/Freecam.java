package net.optifine.features.module.render;

import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.*;
import net.optifine.managers.event.events.CameraListener.*;
import net.optifine.managers.event.events.ChangeLookDirectionListener.ChangeLookDirectionEvent;
import net.optifine.managers.event.events.IsNormalCubeListener.IsNormalCubeEvent;
import net.optifine.managers.event.events.SetOpaqueCubeListener.SetOpaqueCubeEvent;
import net.optifine.mixinterface.IKeyBinding;
import net.optifine.util.RotationUtils;
import net.optifine.util.math.MathUtils;
import net.minecraft.class_1158;
import net.minecraft.class_1160;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public final class Freecam extends Module implements SetOpaqueCubeListener, UpdateListener, RenderListener, IsNormalCubeListener, ChangeLookDirectionListener, CameraListener {
   // $FF: synthetic field
   double Oscar;
   // $FF: synthetic field
   private final BooleanSetting Patricia;
   // $FF: synthetic field
   double Thomas;
   // $FF: synthetic field
   boolean James;
   // $FF: synthetic field
   class_243 Jack;
   // $FF: synthetic field
   double George;
   // $FF: synthetic field
   class_243 Harry;
   // $FF: synthetic field
   private final NumberSetting Mary;
   // $FF: synthetic field
   class_243 William;
   // $FF: synthetic field
   float Jacob;
   // $FF: synthetic field
   float Charlie;

   public void Oliver(CameraThirdPersonEvent event) {
      event.Oliver = true;
      "".length();
      if (null == null) {
         ;
      }
   }

   private double Oscar() {
      double var1 = 0.1D + mc.field_1724.method_18798().method_1022(new class_243(0.0D, 0.0D, 0.0D));
      "".length();
      return -"   ".length() > 0 ? 0.0D : var1;
   }

   public void Oliver(CameraPosEvent event) {
      this.William = event.Oliver;
      event.Oliver = this.Jack;
      "".length();
      if (-"   ".length() <= 0) {
         ;
      }
   }

   private static int llIllII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Oliver(ChangeLookDirectionEvent event) {
      event.Oliver();
      if (this.James) {
         "".length();
         if ("".length() != 0) {
            return;
         }
      } else {
         double d = event.Jack * 0.15D;
         double e = event.Oliver * 0.15D;
         this.Charlie = (float)((double)this.Charlie + d);
         this.Jacob = (float)((double)this.Jacob + e);
         this.Charlie = class_3532.method_15363(this.Charlie, -90.0F, 90.0F);
         "".length();
         if (" ".length() != " ".length()) {
            return;
         }
      }

   }

   public void Oliver(CameraPitchEvent event) {
      event.Oliver = this.Charlie;
      "".length();
      if ((84 ^ 80) != "   ".length()) {
         ;
      }
   }

   public void Charlie() {
      if (this.Patricia.Jack()) {
         this.George();
         "".length();
         if (" ".length() <= 0) {
            return;
         }
      } else {
         this.Thomas = (double)this.Jacob;
         this.George = (double)this.Charlie;
         this.Oscar = this.William.method_1020(this.Jack).method_1022(new class_243(0.0D, 0.0D, 0.0D));
         this.James = true;
      }

      "".length();
      if (-(24 ^ 82 ^ 33 ^ 110) < 0) {
         ;
      }
   }

   public Freecam() {
      super("Freecam", "Allows you to move out of your body.", Category.Harry);
      this.Mary = new NumberSetting("Speed", 1.0D, 0.1D, 10.0D, 0.05D, ValueDisplay.Oliver);
      this.Patricia = new BooleanSetting("Instant Disable", false);
      this.Harry = new class_243(0.0D, 0.0D, 0.0D);
      this.James = false;
      this.William = new class_243(0.0D, 0.0D, 0.0D);
      this.addSetting(this.Mary);
      this.addSetting(this.Patricia);
      "".length();
      if (-" ".length() > "  ".length()) {
         throw null;
      }
   }

   public void Thomas() {
      if (this.James && llIllII(this.Jack.method_1022(this.William), this.Oscar()) < 0) {
         this.George();
         "".length();
         if ("  ".length() < " ".length()) {
            return;
         }
      } else {
         mc.field_1690.field_1903.method_23481(false);
         mc.field_1690.field_1832.method_23481(false);
         mc.field_1690.field_1867.method_23481(false);
         mc.field_1690.field_1894.method_23481(false);
         mc.field_1690.field_1881.method_23481(false);
         mc.field_1690.field_1913.method_23481(false);
         mc.field_1690.field_1849.method_23481(false);
         "".length();
         if (-" ".length() == (153 ^ 157)) {
            return;
         }
      }

   }

   public void Oliver(float partialTicks) {
      mc.field_1690.field_1903.method_23481(false);
      mc.field_1690.field_1832.method_23481(false);
      mc.field_1690.field_1867.method_23481(false);
      mc.field_1690.field_1894.method_23481(false);
      mc.field_1690.field_1881.method_23481(false);
      mc.field_1690.field_1913.method_23481(false);
      mc.field_1690.field_1849.method_23481(false);
      double y;
      double s;
      if (this.James) {
         this.Harry = this.William.method_1020(this.Jack);
         y = this.Harry.method_1022(new class_243(0.0D, 0.0D, 0.0D));
         s = MathUtils.clamp(0.0D, y / (this.Oscar - this.Oscar()), 1.0D);
         this.Jacob = (float)(this.Thomas + (double)RotationUtils.to180((float)((double)mc.field_1724.field_6031 - this.Thomas)) * (1.0D - s));
         this.Charlie = (float)(this.George + (double)RotationUtils.to180((float)((double)mc.field_1724.field_5965 - this.George)) * (1.0D - s));
         this.Jack = this.Jack.method_1019(this.Harry.method_1021((double)mc.method_1534()));
         "".length();
         if ("".length() != 0) {
            return;
         }
      } else if (Global.Jack().WIlliam.George()) {
         y = Math.toRadians((double)this.Jacob);
         s = this.Mary.Jack() * (double)mc.method_1534();
         boolean keyForward = ((IKeyBinding)mc.field_1690.field_1894).isActallyPressed();
         if (keyForward) {
            this.Harry = this.Harry.method_1031(-Math.sin(y) * s, 0.0D, Math.cos(y) * s);
         }

         boolean keyBack = ((IKeyBinding)mc.field_1690.field_1881).isActallyPressed();
         if (keyBack) {
            this.Harry = this.Harry.method_1031(Math.sin(y) * s, 0.0D, -Math.cos(y) * s);
         }

         boolean keyLeft = ((IKeyBinding)mc.field_1690.field_1913).isActallyPressed();
         if (keyLeft) {
            y = Math.toRadians((double)(this.Jacob - 90.0F));
            this.Harry = this.Harry.method_1031(-Math.sin(y) * s, 0.0D, Math.cos(y) * s);
         }

         boolean keyRight = ((IKeyBinding)mc.field_1690.field_1849).isActallyPressed();
         if (keyRight) {
            y = Math.toRadians((double)(this.Jacob + 90.0F));
            this.Harry = this.Harry.method_1031(-Math.sin(y) * s, 0.0D, Math.cos(y) * s);
         }

         boolean keyJump = ((IKeyBinding)mc.field_1690.field_1903).isActallyPressed();
         if (keyJump) {
            this.Harry = this.Harry.method_1031(0.0D, s, 0.0D);
         }

         boolean keySneak = ((IKeyBinding)mc.field_1690.field_1832).isActallyPressed();
         if (keySneak) {
            this.Harry = this.Harry.method_1031(0.0D, -s, 0.0D);
         }

         this.Jack = this.Jack.method_1019(this.Harry.method_1021((double)(mc.method_1534() / 10.0F)));
         this.Harry = this.Harry.method_1021(Math.pow(0.8D, (double)mc.method_1534()));
      }

      "".length();
      if ((86 + 6 - 39 + 88 ^ 50 + 12 - -9 + 66) >= 0) {
         ;
      }
   }

   static {
      "".length();
      if (" ".length() >= 0) {
         ;
      }
   }

   public void Oliver(IsNormalCubeEvent event) {
      event.Oliver();
      "".length();
      if ("".length() != " ".length()) {
         ;
      }
   }

   private void George() {
      EVENT_MANAGER.Jack(RenderListener.class, this);
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      EVENT_MANAGER.Jack(ChangeLookDirectionListener.class, this);
      EVENT_MANAGER.Jack(IsNormalCubeListener.class, this);
      EVENT_MANAGER.Jack(SetOpaqueCubeListener.class, this);
      EVENT_MANAGER.Jack(CameraListener.class, this);
      "".length();
      if ((69 ^ 65) != 0) {
         ;
      }
   }

   public void Oliver(SetOpaqueCubeEvent event) {
      event.Oliver();
      "".length();
      if (-(105 ^ 19 ^ 189 ^ 195) <= 0) {
         ;
      }
   }

   public void Jacob() {
      this.Jack = mc.field_1773.method_19418().method_19326();
      this.Harry = mc.field_1724.method_18798().method_1021(10.0D);
      if (mc.field_1724.method_24828()) {
         this.Harry = this.Harry.method_18805(1.0D, 0.0D, 1.0D);
      }

      this.Jacob = mc.field_1773.method_19418().method_19330();
      this.Charlie = mc.field_1773.method_19418().method_19329();
      this.James = false;
      EVENT_MANAGER.Oliver(RenderListener.class, this);
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      EVENT_MANAGER.Oliver(ChangeLookDirectionListener.class, this);
      EVENT_MANAGER.Oliver(IsNormalCubeListener.class, this);
      EVENT_MANAGER.Oliver(SetOpaqueCubeListener.class, this);
      EVENT_MANAGER.Oliver(CameraListener.class, this);
      "".length();
      if (-" ".length() <= 0) {
         ;
      }
   }

   public void Oliver(CameraRotationEvent event) {
      class_1158 q = new class_1158(0.0F, 0.0F, 0.0F, 1.0F);
      q.method_4925(class_1160.field_20705.method_23214(-this.Jacob));
      q.method_4925(class_1160.field_20703.method_23214(this.Charlie));
      event.Oliver = q;
      "".length();
      if ((59 ^ 3 ^ 2 ^ 62) >= -" ".length()) {
         ;
      }
   }

   public void Oliver(CameraYawEvent event) {
      event.Oliver = this.Jacob;
      "".length();
      if (-(172 ^ 169) < 0) {
         ;
      }
   }
}
