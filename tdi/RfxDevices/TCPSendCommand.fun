public fun TCPSendCommand(in _sock, in _cmnd)
{
	_out = "";

	_status = TcpClient->SendCommand(val(_sock), _cmnd);
	if( _status == 0)
	{
		_out = "Error during send  "//_cmnd//" command";
	}
	else
	{
		_out = TCPCheckAnswer(val(_sock));
		if(_out != "")
		{
			_out = "Error in "//_cmnd//" command execution : "//_msg;
		}
	}
	return ( _out );
}