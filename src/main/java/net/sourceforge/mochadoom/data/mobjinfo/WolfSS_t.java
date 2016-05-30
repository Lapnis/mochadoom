package net.sourceforge.mochadoom.data.mobjinfo;

import static net.sourceforge.mochadoom.gamelogic.mobj_t.MF_COUNTKILL;
import static net.sourceforge.mochadoom.gamelogic.mobj_t.MF_SHOOTABLE;
import static net.sourceforge.mochadoom.gamelogic.mobj_t.MF_SOLID;
import static net.sourceforge.mochadoom.menu.fixed_t.FRACUNIT;

import net.sourceforge.mochadoom.data.sounds.sfxenum_t;
import net.sourceforge.mochadoom.defines.StateNum;

public class WolfSS_t extends Monster_t {
  
  public WolfSS_t() {
    super(84,        // doomednum
        StateNum.S_SSWV_STND,        // spawnstate
        50,        // spawnhealth
        StateNum.S_SSWV_RUN1,        // seestate
        sfxenum_t.sfx_sssit,        // seesound
        8,        // reactiontime
        sfxenum_t.sfx_None,        // attacksound
        StateNum.S_SSWV_PAIN,        // painstate
        170,        // painchance
        sfxenum_t.sfx_popain,        // painsound
        StateNum.S_NULL,        // meleestate
        StateNum.S_SSWV_ATK1,        // missilestate
        StateNum.S_SSWV_DIE1,        // deathstate
        StateNum.S_SSWV_XDIE1,        // xdeathstate
        sfxenum_t.sfx_ssdth,        // deathsound
        8,        // speed
        20 * FRACUNIT,        // radius
        56 * FRACUNIT,        // height
        100,        // mass
        0,        // damage
        sfxenum_t.sfx_posact,        // activesound
        MF_SOLID | MF_SHOOTABLE | MF_COUNTKILL,        // flags
        StateNum.S_SSWV_RAISE1        // raisestate
        );
  }
  
  @Override
  public String getsubType() {
    return "MT_WOLFSS";
  }
  
}
