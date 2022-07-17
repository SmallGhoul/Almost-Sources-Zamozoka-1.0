package net.optifine.features.module.ghost;

import net.optifine.managers.event.events.PacketOutputListener;
import net.optifine.managers.event.events.PacketOutputListener.PacketOutputEvent;
import net.optifine.managers.event.events.PreMotionListener;
import net.minecraft.class_2824;
import net.minecraft.class_2824.class_2825;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class WTap extends Module implements PacketOutputListener, PreMotionListener {
   // $FF: synthetic field
   boolean Harry = false;
   // $FF: synthetic field
   long Jack = -1L;

   protected void Jacob() {
      EVENT_MANAGER.Oliver(PacketOutputListener.class, this);
      EVENT_MANAGER.Oliver(PreMotionListener.class, this);
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   public void George() {
      if (this.Harry && lllllllll(this.Jack + 375L, System.currentTimeMillis()) < 0) {
         this.Jack = System.currentTimeMillis();
         this.Harry = false;
         mc.field_1724.method_5728(false);
      }

      "".length();
      if (" ".length() < "   ".length()) {
         ;
      }
   }

   public WTap() {
      super("WTap", "On 1.8 it allows to give more knockback to the target.");
      this.Oliver(Category.Oscar);
      "".length();
      if (null != null) {
         throw null;
      }
   }

   static {
      "".length();
      if ("".length() <= " ".length()) {
         ;
      }
   }

   private static int lllllllll(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(PacketOutputListener.class, this);
      EVENT_MANAGER.Jack(PreMotionListener.class, this);
      "".length();
      if ("".length() < "  ".length()) {
         ;
      }
   }

   public void onSentPacket(PacketOutputEvent event) {
      if (event.Jacob() instanceof class_2824) {
         class_2824 p = (class_2824)event.Jacob();
         if (p.method_12252().equals(class_2825.field_12875) && mc.field_1724.method_5624()) {
            this.Harry = true;
         }
      }

      "".length();
      if ("  ".length() >= "  ".length()) {
         ;
      }
   }
}
