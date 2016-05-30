package net.sourceforge.mochadoom.data.mobjinfo;

import static net.sourceforge.mochadoom.gamelogic.mobj_t.MF_COUNTKILL;
import static net.sourceforge.mochadoom.gamelogic.mobj_t.MF_SHOOTABLE;
import static net.sourceforge.mochadoom.gamelogic.mobj_t.MF_SOLID;
import static net.sourceforge.mochadoom.menu.fixed_t.FRACUNIT;

import net.sourceforge.mochadoom.data.sounds.sfxenum_t;
import net.sourceforge.mochadoom.defines.StateNum;

public class Possessed_t extends Monster_t {
  
  public Possessed_t() {
    super(3004,        // doomednum
        StateNum.S_POSS_STND,        // spawnstate
        20,        // spawnhealth
        StateNum.S_POSS_RUN1,        // seestate
        sfxenum_t.sfx_posit1,        // seesound
        8,        // reactiontime
        sfxenum_t.sfx_pistol,        // attacksound
        StateNum.S_POSS_PAIN,        // painstate
        200,        // painchance
        sfxenum_t.sfx_popain,        // painsound
        StateNum.S_NULL,        // meleestate MAES: BE careful with "0 - null" states!
        StateNum.S_POSS_ATK1,        // missilestate
        StateNum.S_POSS_DIE1,        // deathstate
        StateNum.S_POSS_XDIE1,        // xdeathstate
        sfxenum_t.sfx_podth1,        // deathsound
        8,        // speed
        20 * FRACUNIT,        // radius
        56 * FRACUNIT,        // height
        100,        // mass
        0,        // damage
        sfxenum_t.sfx_posact,        // activesound
        MF_SOLID | MF_SHOOTABLE | MF_COUNTKILL,        // flags
        StateNum.S_POSS_RAISE1        // raisestate
        );
  }
  
  @Override
  public String getsubType() {
    return "MT_POSSESSED";
  }
  
}
