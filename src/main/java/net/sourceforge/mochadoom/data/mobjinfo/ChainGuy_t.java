package net.sourceforge.mochadoom.data.mobjinfo;

import static net.sourceforge.mochadoom.gamelogic.mobj_t.MF_COUNTKILL;
import static net.sourceforge.mochadoom.gamelogic.mobj_t.MF_SHOOTABLE;
import static net.sourceforge.mochadoom.gamelogic.mobj_t.MF_SOLID;
import static net.sourceforge.mochadoom.menu.fixed_t.FRACUNIT;

import net.sourceforge.mochadoom.data.sounds.sfxenum_t;
import net.sourceforge.mochadoom.defines.StateNum;

public class ChainGuy_t extends Monster_t {
  
  public ChainGuy_t() {
    super( 65,        // doomednum
        StateNum.S_CPOS_STND,        // spawnstate
        70,        // spawnhealth
        StateNum.S_CPOS_RUN1,        // seestate
        sfxenum_t.sfx_posit2,        // seesound
        8,        // reactiontime
        sfxenum_t.sfx_None,        // attacksound
        StateNum.S_CPOS_PAIN,        // painstate
        170,        // painchance
        sfxenum_t.sfx_popain,        // painsound
        StateNum.S_NULL,        // meleestate
        StateNum.S_CPOS_ATK1,        // missilestate
        StateNum.S_CPOS_DIE1,        // deathstate
        StateNum.S_CPOS_XDIE1,        // xdeathstate
        sfxenum_t.sfx_podth2,        // deathsound
        8,        // speed
        20 * FRACUNIT,        // radius
        56 * FRACUNIT,        // height
        100,        // mass
        0,        // damage
        sfxenum_t.sfx_posact,        // activesound
        MF_SOLID | MF_SHOOTABLE | MF_COUNTKILL,        // flags
        StateNum.S_CPOS_RAISE1        // raisestate
        );
  }
  
  @Override
  public String getsubType() {
    return "MT_CHAINGUY";
  }
  
}
