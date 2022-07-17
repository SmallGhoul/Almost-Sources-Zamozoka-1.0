package net.optifine.features.module.movement;

import net.optifine.managers.event.events.IsNormalCubeListener;
import net.optifine.managers.event.events.IsNormalCubeListener.IsNormalCubeEvent;
import net.optifine.managers.event.events.PlayerMoveListener;
import net.optifine.managers.event.events.PlayerMoveListener.PlayerMoveEvent;
import net.optifine.managers.event.events.SetOpaqueCubeListener;
import net.optifine.managers.event.events.SetOpaqueCubeListener.SetOpaqueCubeEvent;
import net.optifine.managers.event.events.UpdateListener;
import net.minecraft.class_2884;
import net.minecraft.class_746;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.concurrent.ThreadLocalRandom;

public final class NoClip extends Module implements IsNormalCubeListener, SetOpaqueCubeListener, UpdateListener, PlayerMoveListener {
   public void Thomas() {
      class_746 player = mc.field_1724;
      player.field_5960 = true;
      if (mc.field_1690.field_1903.method_1434()) {
         player.method_18800(mc.field_1724.method_18798().field_1352, 0.1D + 0.05D * (double)ThreadLocalRandom.current().nextFloat(), mc.field_1724.method_18798().field_1350);
         "".length();
         if ("  ".length() <= "".length()) {
            return;
         }
      } else if (mc.field_1690.field_1832.method_1434()) {
         player.method_18800(mc.field_1724.method_18798().field_1352, -0.1D - 0.05D * (double)ThreadLocalRandom.current().nextFloat(), mc.field_1724.method_18798().field_1350);
         "".length();
         if ("  ".length() == 0) {
            return;
         }
      } else {
         player.method_18800(mc.field_1724.method_18798().field_1352, 0.0D, mc.field_1724.method_18798().field_1350);
      }

      mc.field_1724.field_3944.method_2872().method_10743(new class_2884(mc.field_1724.method_5667()));
      "".length();
      if ("   ".length() != " ".length()) {
         ;
      }
   }

   public void Oliver(IsNormalCubeEvent event) {
      event.Oliver();
      "".length();
      if (-" ".length() == -" ".length()) {
         ;
      }
   }

   public NoClip() {
      super("NoClip", "Allows you to walk thought blocks.");
      this.Oliver((Category)Category.Jack);
      "".length();
      if (" ".length() < 0) {
         throw null;
      }
   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      EVENT_MANAGER.Oliver(PlayerMoveListener.class, this);
      EVENT_MANAGER.Oliver(IsNormalCubeListener.class, this);
      EVENT_MANAGER.Oliver(SetOpaqueCubeListener.class, this);
      "".length();
      if (-" ".length() <= "   ".length()) {
         ;
      }
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      EVENT_MANAGER.Jack(PlayerMoveListener.class, this);
      EVENT_MANAGER.Jack(IsNormalCubeListener.class, this);
      EVENT_MANAGER.Jack(SetOpaqueCubeListener.class, this);
      mc.field_1724.field_5960 = false;
      "".length();
      if ("  ".length() > 0) {
         ;
      }
   }

   static {
      "".length();
      if ((26 ^ 31) > 0) {
         ;
      }
   }

   public void Oliver(PlayerMoveEvent event) {
      event.Oliver.setNoClip(true);
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   public void Oliver(SetOpaqueCubeEvent event) {
      event.Oliver();
      "".length();
      if ("".length() >= 0) {
         ;
      }
   }
}
