import { Link } from "react-router-dom"

function Navbar(){
    return(
    <div>
        <nav className="navbar navbar-expand-lg navbar-light bg-light">
        <div className="container-fluid">
            <Link to="/">
                <div className="navbar-brand" >Veebipood</div>
            </Link>
            <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span className="navbar-toggler-icon"></span>
            </button>
            <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div className="navbar-nav">
                <Link to="Lisa"> 
                    <div className="nav-link" >Lisa toode</div>
                </Link>
                <Link to="Halda"> 
                    <div className="nav-link" >Halda tooteid</div>
                </Link>
                <Link to="ostukorv"> 
                    <div className="nav-link disabled">Ostukurv</div>
                </Link >
                </div>
            </div>
        </div>
        </nav>
    </div>)
}

export default Navbar