package wordyGame;


/**
* wordyGame/noOtherPlayersAvailable.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Wordy.idl
* Sunday, June 18, 2023 11:16:05 PM SGT
*/

public final class noOtherPlayersAvailable extends org.omg.CORBA.UserException
{
  public String message = null;

  public noOtherPlayersAvailable ()
  {
    super(noOtherPlayersAvailableHelper.id());
  } // ctor

  public noOtherPlayersAvailable (String _message)
  {
    super(noOtherPlayersAvailableHelper.id());
    message = _message;
  } // ctor


  public noOtherPlayersAvailable (String $reason, String _message)
  {
    super(noOtherPlayersAvailableHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class noOtherPlayersAvailable
