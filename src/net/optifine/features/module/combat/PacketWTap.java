package net.optifine.features.module.combat;

import net.optifine.config.EnumSetting;
import net.optifine.managers.event.events.PacketOutputListener;
import net.optifine.managers.event.events.PacketOutputListener.PacketOutputEvent;
import net.optifine.util.GeneralSettings.PvpVersion;
import net.minecraft.class_2824;
import net.minecraft.class_2824.class_2825;
import net.minecraft.class_2848;
import net.minecraft.class_2848.class_2849;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class PacketWTap extends Module implements PacketOutputListener {
   // $FF: synthetic field
   private final EnumSetting<PvpVersion> Jack;

   protected void Charlie() {
      EVENT_MANAGER.Jack(PacketOutputListener.class, this);
      "".length();
      if ("   ".length() > "  ".length()) {
         ;
      }
   }

   public String Oliver() {
      String var1 = ((PvpVersion)this.Jack.Harry()).name;
      "".length();
      return " ".length() <= 0 ? null : var1;
   }

   public PacketWTap() {
      super("PacketWTap", "On 1.8 it allows to give more knockback to the target.\nOn 1.9+ it's helping to give critical hits while sprinting");
      this.Jack = new EnumSetting("PvP Version", PvpVersion.values(), PvpVersion.v1_9);
      this.Oliver(Category.Oliver);
      this.addSetting(this.Jack);
      "".length();
      if ((162 + 53 - 86 + 66 ^ 192 + 135 - 180 + 51) == 0) {
         throw null;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(PacketOutputListener.class, this);
      "".length();
      if ("".length() >= 0) {
         ;
      }
   }

   static {
      "".length();
      if ("  ".length() == "  ".length()) {
         ;
      }
   }

   public void onSentPacket(PacketOutputEvent event) {
      if (event.Jacob() instanceof class_2824) {
         class_2824 p = (class_2824)event.Jacob();
         if (p.method_12252().equals(class_2825.field_12875) && this.Jack.Harry() == PvpVersion.v1_8) {
            mc.field_1724.field_3944.method_2883(new class_2848(mc.field_1724, class_2849.field_12981));
         }

         "".length();
         if (null != null) {
            return;
         }
      } else if (event.Jacob() instanceof class_2848) {
         class_2848 p = (class_2848)event.Jacob();
         if (p.method_12365() == class_2849.field_12981 && this.Jack.Harry() == PvpVersion.v1_9) {
            event.Oliver(new class_2848(mc.field_1724, class_2849.field_12985));
         }
      }

      "".length();
      if (-" ".length() <= -" ".length()) {
         ;
      }
   }
}
