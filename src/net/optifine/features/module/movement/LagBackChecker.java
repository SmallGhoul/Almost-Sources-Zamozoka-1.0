package net.optifine.features.module.movement;

import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.managers.event.events.PacketInputListener;
import net.optifine.managers.event.events.PacketInputListener.PacketInputEvent;
import net.optifine.util.audio.Sound;
import net.optifine.util.audio.SoundManager;
import net.minecraft.class_2708;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class LagBackChecker extends Module implements PacketInputListener {
   // $FF: synthetic field
   BooleanSetting James = new BooleanSetting("Disable Sneak", true);
   // $FF: synthetic field
   BooleanSetting Mary = new BooleanSetting("Disable Step", true);
   // $FF: synthetic field
   BooleanSetting Charlie = new BooleanSetting("Disable LongJump", true);
   // $FF: synthetic field
   BooleanSetting William = new BooleanSetting("Disable TargetStrafe", true);
   // $FF: synthetic field
   BooleanSetting Harry = new BooleanSetting("Notify", true);
   // $FF: synthetic field
   BooleanSetting Jacob = new BooleanSetting("Disable Fly", true);
   // $FF: synthetic field
   BooleanSetting Jack = new BooleanSetting("Play Sound", true);
   // $FF: synthetic field
   BooleanSetting Thomas = new BooleanSetting("Disable HighJump", true);
   // $FF: synthetic field
   BooleanSetting George = new BooleanSetting("Disable NoClip", true);
   // $FF: synthetic field
   BooleanSetting Oscar = new BooleanSetting("Disable Speed", true);

   protected void Charlie() {
      EVENT_MANAGER.Jack(PacketInputListener.class, this);
      "".length();
      if ("   ".length() != 0) {
         ;
      }
   }

   private boolean Oliver(Module module, BooleanSetting setting) {
      boolean var3;
      if (setting.Jack() && module.isEnabled()) {
         module.Jack(false);
         if (this.Harry.Jack()) {
            Global.Thomas().getNotificationManager().spawnNotification(module, "Was disabled due to setback.");
         }

         var3 = true;
         "".length();
         if (" ".length() < -" ".length()) {
            return (boolean)"".length();
         }
      } else {
         var3 = false;
         "".length();
         if ("  ".length() <= 0) {
            return (boolean)"".length();
         }
      }

      return var3;
   }

   public LagBackChecker() {
      super("SetbackFix", "Disables modules on anticheat lagback.");
      this.Oliver(Category.Jack);
      this.addSetting(this.Jack);
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      this.addSetting(this.Thomas);
      this.addSetting(this.George);
      this.addSetting(this.Oscar);
      this.addSetting(this.James);
      this.addSetting(this.William);
      this.addSetting(this.Mary);
      "".length();
      if ("  ".length() == (17 ^ 126 ^ 222 ^ 181)) {
         throw null;
      }
   }

   static {
      "".length();
      if ("   ".length() <= (30 + 57 - 48 + 94 ^ 62 + 41 - -15 + 11)) {
         ;
      }
   }

   public void Oliver(PacketInputEvent event) {
      if (event.Jacob() instanceof class_2708) {
         ModuleManager mm = Global.Jack();
         boolean playSound = this.Oliver(mm.Sarah, this.Jacob);
         playSound |= this.Oliver(mm.k, this.Charlie);
         playSound |= this.Oliver(mm.y, this.Thomas);
         playSound |= this.Oliver(mm.CharliE, this.George);
         playSound |= this.Oliver(mm.var3, this.Oscar);
         playSound |= this.Oliver(mm.var2, this.James);
         playSound |= this.Oliver(mm.r, this.William);
         playSound |= this.Oliver(mm.var5, this.Mary);
         if (playSound && this.Jack.Jack()) {
            SoundManager.play(Sound.DISABLE);
         }
      }

      "".length();
      if (-"  ".length() < 0) {
         ;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(PacketInputListener.class, this);
      "".length();
      if ("   ".length() >= 0) {
         ;
      }
   }
}
