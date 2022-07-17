package net.optifine.features.module.ghost;

import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.StrafeEventListener;
import net.optifine.managers.event.events.StrafeEventListener.StrafeEvent;
import net.optifine.util.MovementUtils;
import net.minecraft.class_243;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class Strafe extends Module implements StrafeEventListener {
   // $FF: synthetic field
   int Jack;
   // $FF: synthetic field
   private final NumberSetting Harry = new NumberSetting("Strength", 1.0D, 0.0D, 1.0D, 0.01D);
   // $FF: synthetic field
   private final NumberSetting Jacob;

   public void Charlie() {
      EVENT_MANAGER.Jack(StrafeEventListener.class, this);
      "".length();
      if (-" ".length() == -" ".length()) {
         ;
      }
   }

   static {
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   public void Oliver(StrafeEvent event) {
      if (!MovementUtils.isMoving()) {
         "".length();
         if ((4 ^ 0) == 0) {
            return;
         }
      } else {
         ++this.Jack;
         double yaw = MovementUtils.getDirection(event.Harry);
         double speed = (double)MovementUtils.getSpeed();
         class_243 vel = mc.field_1724.method_18798();
         if (this.Jack % this.Jacob.Oscar() == 0) {
            mc.field_1724.method_18800(vel.field_1352 * (1.0D - this.Harry.Jack()) + -Math.sin(yaw) * speed * this.Harry.Jack(), vel.method_10214(), vel.field_1350 * (1.0D - this.Harry.Jack()) + Math.cos(yaw) * speed * this.Harry.Jack());
         }

         "".length();
         if ((45 ^ 41) == 0) {
            return;
         }
      }

   }

   public Strafe() {
      super("Strafe", "Allows you to strafe.");
      this.Jacob = new NumberSetting("Strafe Tick", 1.0D, 1.0D, 10.0D, 1.0D, ValueDisplay.Jack);
      this.Jack = 0;
      this.Oliver(Category.Oscar);
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      "".length();
      if ("  ".length() > "  ".length()) {
         throw null;
      }
   }

   public String Oliver() {
      String var1 = String.valueOf((new StringBuilder()).append(this.Harry.Jack() * 100.0D).append("% every ").append(this.Jacob.William()).append(" tick"));
      "".length();
      return "".length() != 0 ? null : var1;
   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(StrafeEventListener.class, this);
      "".length();
      if (-" ".length() <= "".length()) {
         ;
      }
   }
}
