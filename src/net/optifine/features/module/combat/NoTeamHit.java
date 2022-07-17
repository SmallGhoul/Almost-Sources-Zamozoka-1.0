package net.optifine.features.module.combat;

import net.optifine.managers.event.events.PacketOutputListener;
import net.optifine.managers.event.events.PacketOutputListener.PacketOutputEvent;
import net.minecraft.class_1297;
import net.minecraft.class_2824;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class NoTeamHit extends Module implements PacketOutputListener {
   public void onSentPacket(PacketOutputEvent event) {
      if (!(event.Jacob() instanceof class_2824)) {
         "".length();
         if ((148 ^ 144) != (23 ^ 19)) {
            return;
         }
      } else {
         class_2824 p = (class_2824)event.Jacob();
         class_1297 e = p.method_12248(mc.field_1687);
         if (e != null && mc.field_1724.method_5722(e)) {
            event.Oliver();
         }

         "".length();
         if (null != null) {
            return;
         }
      }

   }

   static {
      "".length();
      if ((159 ^ 155) > 0) {
         ;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(PacketOutputListener.class, this);
      "".length();
      if ("   ".length() > 0) {
         ;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(PacketOutputListener.class, this);
      "".length();
      if ((128 ^ 198 ^ 203 ^ 137) > 0) {
         ;
      }
   }

   public NoTeamHit() {
      super("NoTeamHit");
      this.Oliver(Category.Oliver);
      "".length();
      if (-(48 ^ 21 ^ 141 ^ 172) > 0) {
         throw null;
      }
   }
}
