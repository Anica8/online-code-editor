import { Box } from "@mui/material";
import Editor from "./Editor";
import styled from "@emotion/styled";
import { useContext } from "react";
import { DataContext } from "../context/DataProvider";

const Container = styled(Box)`
    display: flex;
    background-color: #060606;
    height: 55vh;
`

const Code = () => {
    const {html, setHtml, css, setCss, js, setJs} = useContext(DataContext);
    return(
        <Container>
        <Editor 
        title="HTML"
        sign='/' 
        signColor="#FF3C41"
        value={html}
        onChange={setHtml} 
        />
        <Editor 
        title="CSS" 
        sign='+' 
        signColor="#0EBEFF"
        value={css}
        onChange={setCss} 
        />
        <Editor 
        title="JS" 
        sign='{}' 
        signColor="#FCD000"
        value={js}
        onChange={setJs}
        />
        </Container>
    )
}

export default Code;