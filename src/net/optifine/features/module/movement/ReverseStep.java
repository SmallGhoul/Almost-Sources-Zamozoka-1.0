package net.optifine.features.module.movement;

import net.optifine.config.NumberSetting;
import net.optifine.managers.event.events.JumpEventListener;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.MovementUtils;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class ReverseStep extends Module implements UpdateListener, JumpEventListener {
   // $FF: synthetic field
   boolean Jack = false;
   // $FF: synthetic field
   private final NumberSetting Harry = new NumberSetting("Motion", 1.0D, 0.20999999344348907D, 2.0D, 0.005D);

   public ReverseStep() {
      super("ReverseStep", "Allows you to step down blocks faster", Category.Jack);
      this.addSetting(this.Harry);
      "".length();
      if (-" ".length() > (45 ^ 41)) {
         throw null;
      }
   }

   public void George() {
      this.Jack = true;
      "".length();
      if (null == null) {
         ;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      EVENT_MANAGER.Jack(JumpEventListener.class, this);
      "".length();
      if (-(98 ^ 102) <= 0) {
         ;
      }
   }

   public void Thomas() {
      if (mc.field_1724.method_24828() && lllllIl(mc.field_1724.method_18798().field_1351, 0.0D) <= 0) {
         this.Jack = false;
      }

      if (!this.Jack) {
         MovementUtils.setMotionY((double)(-this.Harry.George()));
      }

      "".length();
      if (-"  ".length() <= 0) {
         ;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      EVENT_MANAGER.Oliver(JumpEventListener.class, this);
      "".length();
      if (-" ".length() < 0) {
         ;
      }
   }

   private static int lllllIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   static {
      "".length();
      if (-"  ".length() <= 0) {
         ;
      }
   }
}
