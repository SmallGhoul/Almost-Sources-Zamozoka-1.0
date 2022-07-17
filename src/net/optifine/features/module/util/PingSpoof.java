package net.optifine.features.module.util;

import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.PacketOutputListener;
import net.optifine.managers.event.events.PacketOutputListener.PacketOutputEvent;
import net.optifine.managers.event.events.PreMotionListener;
import net.optifine.util.DelayedPacket;
import io.netty.util.internal.ConcurrentSet;
import net.minecraft.class_2596;
import net.minecraft.class_2793;
import net.minecraft.class_2809;
import net.minecraft.class_2827;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.Iterator;

public class PingSpoof extends Module implements PreMotionListener, PacketOutputListener {
   // $FF: synthetic field
   private final BooleanSetting Charlie = new BooleanSetting("TeleportConfirm Packets", true);
   // $FF: synthetic field
   private final BooleanSetting Jacob = new BooleanSetting("Transcation", true);
   // $FF: synthetic field
   private final BooleanSetting Harry = new BooleanSetting("KeepAlive Packets", true);
   // $FF: synthetic field
   private final BooleanSetting Thomas = new BooleanSetting("All Packets", false);
   // $FF: synthetic field
   private final NumberSetting George;
   // $FF: synthetic field
   ConcurrentSet<DelayedPacket> Jack;

   public void onSentPacket(PacketOutputEvent event) {
      class_2596<?> packet = event.Jacob();
      if (packet instanceof class_2809 && this.Jacob.Jack() || packet instanceof class_2827 && this.Harry.Jack() || this.Charlie.Jack() && packet instanceof class_2793 || this.Thomas.Jack()) {
         event.Oliver();
         this.Jack.add(new DelayedPacket(event.Jacob(), this.George.Oscar() / 50));
         "".length();
      }

      "".length();
      if ((54 ^ 88 ^ 194 ^ 168) <= (119 + 79 - 105 + 50 ^ 137 + 23 - 69 + 48)) {
         ;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(PreMotionListener.class, this);
      EVENT_MANAGER.Jack(PacketOutputListener.class, this);
      Iterator var1 = this.Jack.iterator();

      do {
         if (!var1.hasNext()) {
            this.Jack.clear();
            "".length();
            if (-"   ".length() > 0) {
               return;
            }

            return;
         }

         DelayedPacket packet = (DelayedPacket)var1.next();
         mc.field_1724.field_3944.method_2883(packet.getPacket());
         "".length();
      } while(null == null);

   }

   public PingSpoof() {
      super("PingSpoof", "Fakes your ping.");
      this.George = new NumberSetting("Delay", 10000.0D, 50.0D, 25000.0D, 50.0D, ValueDisplay.Oliver);
      this.Jack = new ConcurrentSet();
      this.Oliver(Category.Charlie);
      this.addSetting(this.George);
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      this.addSetting(this.Thomas);
      "".length();
      if (" ".length() < 0) {
         throw null;
      }
   }

   public String Oliver() {
      String var1 = String.valueOf((new StringBuilder()).append(this.George.Jack()).append("ms"));
      "".length();
      return "  ".length() < 0 ? null : var1;
   }

   public void George() {
      if (mc.field_1724 == null) {
         "".length();
         if (" ".length() <= "".length()) {
            return;
         }
      } else {
         this.Jack.removeIf((packet) -> {
            byte var1 = packet.tick(mc.field_1724.field_3944.method_2872());
            "".length();
            return (boolean)(null != null ? "".length() : var1);
         });
         "".length();
         "".length();
         if (-" ".length() >= "".length()) {
            return;
         }
      }

   }

   static {
      "".length();
      if (null == null) {
         ;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(PreMotionListener.class, this);
      EVENT_MANAGER.Oliver(PacketOutputListener.class, this);
      "".length();
      if (null == null) {
         ;
      }
   }
}
