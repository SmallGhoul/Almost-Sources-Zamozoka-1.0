package net.optifine.features.module.combat;

import net.optifine.Global;
import net.optifine.managers.event.events.PacketOutputListener;
import net.optifine.managers.event.events.PacketOutputListener.PacketOutputEvent;
import net.minecraft.class_1297;
import net.minecraft.class_2824;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class NoFriendHit extends Module implements PacketOutputListener {
   static {
      "".length();
      if (null == null) {
         ;
      }
   }

   public void onSentPacket(PacketOutputEvent event) {
      if (!(event.Jacob() instanceof class_2824)) {
         "".length();
         if (-(126 ^ 123) >= 0) {
            return;
         }
      } else {
         class_2824 p = (class_2824)event.Jacob();
         class_1297 e = p.method_12248(mc.field_1687);
         if (e != null && Global.Oscar().contains(e.method_5820())) {
            event.Oliver();
         }

         "".length();
         if ("  ".length() >= "   ".length()) {
            return;
         }
      }

   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(PacketOutputListener.class, this);
      "".length();
      if ("  ".length() > 0) {
         ;
      }
   }

   public NoFriendHit() {
      super("NoFriendHit");
      this.Oliver(Category.Oliver);
      "".length();
      if ((78 ^ 22 ^ 232 ^ 181) <= 0) {
         throw null;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(PacketOutputListener.class, this);
      "".length();
      if ("   ".length() > -" ".length()) {
         ;
      }
   }
}
