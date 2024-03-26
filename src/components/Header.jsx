import { AppBar, Toolbar, styled } from '@mui/material';


const Container = styled(AppBar)`
    background: #060606;
    height: 9vh;
`


const Header = () => {
    
    const logo = 'https://upload.wikimedia.org/wikipedia/commons/8/80/Atom_editor_logo.svg'

    return (
        <Container position='static'>
            <Toolbar>
                <img src={logo} alt='logo' style={{ width: 40 }} />
            </Toolbar>
        </Container>
    )
}

export default Header;